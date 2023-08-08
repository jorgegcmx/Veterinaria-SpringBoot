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
@Table(name = "citas", schema = "veterinaria")
public class Citas implements Serializable {

    private static final long serialVersionUID = 5764431782932395757L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "citas_id")
    private Long citas_id ;
    @ManyToOne
    @JoinColumn(name = "medicoid")
    private Medicos medicos;
    @ManyToOne
    @JoinColumn(name = "pacienteid")
    private Pacientes pacientes;
    @ManyToOne
    @JoinColumn(name = "propietarioid")
    private Propietario propietario;
    private Timestamp fecha ;
}
