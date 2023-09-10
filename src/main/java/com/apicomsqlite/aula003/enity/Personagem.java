package com.apicomsqlite.aula003.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Personagem {
    @Id
    private int id;

    private String nome;
    private String classe;
    private int nivel;

    Personagem(){}

    // Getters e setters
    public String getClasse() {
        return classe;
    }
    public int getId() {
        return id;
    }
    public int getNivel() {
        return nivel;
    }
    public String getNome() {
        return nome;
    }
    
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
