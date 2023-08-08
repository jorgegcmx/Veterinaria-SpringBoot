package com.vet.demo.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Data
@Table(name = "pacientes", schema = "veterinaria")
public class Pacientes implements Serializable {

    private static final long serialVersionUID = 5764431782932395757L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pacientes_id")
    private Long pacientes_id ;
    private String nombrepaciente;
    private String tipo;
    private String fecha_naciemiento;
    private String nombre_propietario;
    private String telefono;
}
