package com.cibertec.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    Integer idPersona;
    String nombre;
    String apellido;
    String tipoDocumento;
    Integer numeroDocumento;
    String sexoPersona;
    Integer telefPersona;
    String emailPersona;
    String passwordPersona;
}
