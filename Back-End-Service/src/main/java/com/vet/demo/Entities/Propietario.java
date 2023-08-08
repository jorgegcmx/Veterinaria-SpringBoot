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
@Table(name = "propietario", schema = "veterinaria")
public class Propietario implements Serializable {

    private static final long serialVersionUID = 5764431782932395757L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "propietario_id")
    private Long propietario_id ;
    private String apallido_p;
    private String apallido_m;
    private String nombre;
}
