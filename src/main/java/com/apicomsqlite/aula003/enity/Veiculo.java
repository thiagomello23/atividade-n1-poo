package com.apicomsqlite.aula003.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Veiculo {
    @Id
    private int id;

    private String tipoVeiculo;
    private String placaVeiculo;
    private double valorVeiculo;
    
    // Getters e setters
    public int getId() {
        return id;
    }
    public String getPlacaVeiculo() {
        return placaVeiculo;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }
}
