package com.example.virtualg.virtualg.model;


import javax.persistence.*;

/**
 * Created by vasil on 28/04/2018.
 */
@Entity
@Table(name = "Fabricas")
public class Fabricas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private  String nombre;
    @Column(name = "propietario")
    private String propietario;
    @Column (name = "dni")
    private String dni;
    @Column (name = "poblacion")
    private String poblacion;
    @Column(name = "cd")
    private int cd;
    @Column(name = "tlf")
    private int tlf;
    @Column (name = "comision")
    private int comision;

    public Fabricas(){

    }

    public Fabricas(String nombre, String propietario, String dni, String poblacion, int cd, int tlf, int comision) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.dni = dni;
        this.poblacion = poblacion;
        this.cd = cd;
        this.tlf = tlf;
        this.comision = comision;
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

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
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

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
}
