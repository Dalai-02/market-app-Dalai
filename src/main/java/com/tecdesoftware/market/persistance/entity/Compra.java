package com.tecdesoftware.market.persistance.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Para que se genere automaticamente el id

    @Column(name = "id_compras")
    private Integer idCompra;

    private String nombre;

    @Column(name = "id_cliente")
    private Integer idCliente;

    private LocalDateTime fechaCompra;

    @Column( name = "medio_pago")
    private Double medioPago;

    private Integer comentario;

    private Boolean estado;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Double getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(Double medioPago) {
        this.medioPago = medioPago;
    }

    public Integer getComentario() {
        return comentario;
    }

    public void setComentario(Integer comentario) {
        this.comentario = comentario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
