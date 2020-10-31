package com.ixcorp.pe.deportes.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name =  "futbolista")
public class Futbolista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_futbolista")
    private Long futbolistaId;

    @Column(name = "nombre")
    private String nombres;

    @Column(name = "apellido")
    private String apellidos;

    @Column(name = "edad")
    private int edad;

    @Column(name = "sexo")
    private  String sexo;

    @Column(name = "fecha_nac")
    private Date fechaNacimiento;

    public Futbolista() {
    }

    public Long getFutbolistaId() {
        return futbolistaId;
    }

    public void setFutbolistaId(Long futbolistaId) {
        this.futbolistaId = futbolistaId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
