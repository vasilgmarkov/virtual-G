package com.example.virtualg.virtualg.model;

import javax.persistence.*;

/**
 * Created by vasil on 28/04/2018.
 */
@Entity
@Table(name = "Clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private  String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column (name = "dni")
    private String dni;
    @Column
    private String poblacion;
    @Column(name = "cd")
    private String cd;
    @Column(name = "tlf")
    private String tlf;

    public Clientes(){

    }

    public Clientes(int id, String nombre, String apellidos, String dni, String poblacion, String cd, String tlf) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.poblacion = poblacion;
        this.cd = cd;
        this.tlf = tlf;
    }
    public Clientes(String nombre, String apellidos, String dni, String poblacion, String cd, String tlf) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.poblacion = poblacion;
        this.cd = cd;
        this.tlf = tlf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
}
