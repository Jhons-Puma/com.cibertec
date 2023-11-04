package com.cibertec.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva" )
    Integer idReserva;

    @ManyToOne
    @JoinColumn(name = "idhabitacion")
    Habitacion habitacion;
    @ManyToOne
    @JoinColumn(name = "idcliente")
    Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idTrabajador")
    Trabajador trabajador;
    String tipoReserva;
    Date fechaReserva;
    Date fechaIngreso;
    Date fechaSalida;
    Double costoAlojamiento;
    String observacion;
    String estado;
}
