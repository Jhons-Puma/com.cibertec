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
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idPago;
    @ManyToOne
    @JoinColumn(name = "idreserva")
    Reserva reserva;
    String tipoComprobante;
    Integer numComprobante;
    Double igv;
    Double totalPago;
    Date fechaEmision;
    Date fechaPago;
    String estado;
}
