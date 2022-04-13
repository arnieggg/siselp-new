package edu.elp.siselp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="administrativo")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Administrtivo extends Persona{

    @Column(name="arealabor",length = 25,nullable = false)
    private String areaLabor;

    @Column(name="cod_admin",length = 12)
    private String CodAdmin;

}
