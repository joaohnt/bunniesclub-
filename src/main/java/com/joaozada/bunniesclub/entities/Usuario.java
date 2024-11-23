package com.joaozada.bunniesclub.entities;

import jakarta.persistence.*;

@Entity
@Table(name="tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @ManyToOne
    private Membro bias;

    public Usuario(){}

    public Usuario(Long id, String nome, String email, Membro bias) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.bias = bias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Membro getBias() {
        return bias;
    }

    public void setBias(Membro bias) {
        this.bias = bias;
    }
}
