package com.dio.padroesdeprojetoSpring.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    @ManyToOne
    private Endereco endereco;

}
