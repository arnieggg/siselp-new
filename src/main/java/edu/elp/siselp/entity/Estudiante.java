package edu.elp.siselp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Estudiante extends Persona{

    @Column(name="codigo",length = 10,nullable = false)
    private  String codigo;

    @Column(name="serie",length = 8)
    private  String serie;

    @Column(name ="estado_egreso",length = 5)
    private  String estado; //Si es egresado:SI,NO

    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    private  Escuela escuela;

    public Estudiante(String nombre, String apellido, String edad, String sexo, String dni, String direccion, String telefono, Date fechaNacimiento, String codigo, String serie, String estado, Escuela escuela) {
        super(nombre, apellido, edad, sexo, dni, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.serie = serie;
        this.estado = estado;
        this.escuela = escuela;
    }

    public Estudiante(Long idpersona, String codigo, String serie, String estado, Escuela escuela) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
        this.estado = estado;
        this.escuela = escuela;
    }

    public Estudiante(String codigo, String serie, String estado, Escuela escuela) {
        this.codigo = codigo;
        this.serie = serie;
        this.estado = estado;
        this.escuela = escuela;
    }

    public Estudiante(String nombre, String apellido, String edad, String sexo, String dni, String direccion, String telefono, Date fechaNacimiento) {
        super(nombre, apellido, edad, sexo, dni, direccion, telefono, fechaNacimiento);
    }

    public Estudiante(Long idpersona) {
        super(idpersona);
    }

    public Estudiante() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }
}

