package com.apicomsqlite.aula003.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicomsqlite.aula003.enity.Veiculo;
import com.apicomsqlite.aula003.repository.VeiculoRepository;

import jakarta.transaction.Transactional;

@Service
public class VeiculoService {
    
    @Autowired()
    private VeiculoRepository veiculoRepository;

    @Transactional()
    public String createVeiculo(Veiculo veiculo) {
        veiculoRepository.save(veiculo);
        return "Veiculo salvo com sucesso";
    } 

    @Transactional()
    public List<Veiculo> getAllVeiculos() {
        return veiculoRepository.findAll();
    }

    @Transactional()
    public void deleteAllVeiculo() {
        veiculoRepository.deleteAll();
    }

    @Transactional()
    public void updateVeiculo(Veiculo veiculo) {
        Veiculo veiculoUpdate = veiculoRepository.getReferenceById(veiculo.getId());
        veiculoUpdate.setPlacaVeiculo(veiculo.getPlacaVeiculo());
        veiculoUpdate.setTipoVeiculo(veiculo.getTipoVeiculo());
        veiculoUpdate.setValorVeiculo(veiculo.getValorVeiculo());
        veiculoRepository.save(veiculoUpdate);
    }
}
