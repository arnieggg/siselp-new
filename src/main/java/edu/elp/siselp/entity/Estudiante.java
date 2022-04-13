package edu.elp.siselp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
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

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie, String estado) {
        this.codigo = codigo;
        this.serie = serie;
        this.estado = estado;
    }

    public Estudiante(Long idpersona, String codigo, String serie, String estado) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
        this.estado = estado;
    }

    public Estudiante(String nombre, String apellido, String edad, String sexo, Integer dni, String direccion, String telefono, Date fechaNacimiento, String codigo, String serie, String estado) {
        super(nombre, apellido, edad, sexo, dni, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.serie = serie;
        this.estado = estado;
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
}
