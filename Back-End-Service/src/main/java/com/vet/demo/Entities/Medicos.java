package com.vet.demo.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Data
@Table(name = "medicos", schema = "veterinaria")
public class Medicos implements Serializable {

    private static final long serialVersionUID = 5764431782932395757L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicos_id")
    private Long medicos_id;
    private String apellido_paterno;
    private String apallido_materno;
    private String nombre;
    private String cedula;
}
