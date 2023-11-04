package com.cibertec.model;

import jakarta.persistence.*;

@Entity
@Table(name = "consumos")
public class Consumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConsumo")
    Integer idConsumo;
    @ManyToOne
    @JoinColumn(name = "idreserva")
    Reserva reserva;
    @ManyToOne
    @JoinColumn(name = "idProducto")
    Producto producto;
    Integer cantidad;
    Double precioVenta;
    String estado;
}
