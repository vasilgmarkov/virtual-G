package com.example.virtualg.virtualg.model;

import javax.persistence.*;

/**
 * Created by vasil on 29/04/2018.
 */
@Entity
@Table(name = "Facturas")
public class Facturas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "totalVenta")
    private int totalVenta;
    @Column(name = "importe_beneficio")
    private int importe_beneficio;
    @Column(name = "pagado")
    private int pagado;

    @ManyToOne
    private Clientes cliente;

    @ManyToOne
    private Fabricas fabrica;

    public Facturas(){

    }

    public Facturas(int totalVenta, int importe_beneficio, int id_cliente, int id_fabrica) {
        this.totalVenta = totalVenta;
        this.importe_beneficio = importe_beneficio;
        this.pagado = 0;
        this.cliente = new Clientes(id_cliente,"","","","","","");
        this.fabrica = new Fabricas(id_fabrica);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }

    public int getImporte_beneficio() {
        return importe_beneficio;
    }

    public void setImporte_beneficio(int importe_beneficio) {
        this.importe_beneficio = importe_beneficio;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Fabricas getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabricas fabrica) {
        this.fabrica = fabrica;
    }
}