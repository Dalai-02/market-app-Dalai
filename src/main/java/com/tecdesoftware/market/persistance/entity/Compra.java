package com.tecdesoftware.market.persistance.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

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

    //Relación con la entidad cliente: Muchas compras a un cliente
    @ManyToOne
    //No quiero que se modifique la entidad cliente, solo quiero relacionarla
    @JoinColumn (name= "id_cliente", insertable = false, updatable = false)
    private Clientes cliente;

    //Relación con la entidad CompraProducto: Una compra con muchos productos
    @OneToMany(mappedBy = "compra")
    private List<CompraProducto> productos;

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

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<CompraProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<CompraProducto> productos) {
        this.productos = productos;
    }
}
