package com.apicomsqlite.aula003.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apicomsqlite.aula003.enity.Personagem;
import com.apicomsqlite.aula003.enity.Veiculo;
import com.apicomsqlite.aula003.service.PersonagemService;
import com.apicomsqlite.aula003.service.VeiculoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController()
public class VeiculoController {

  @Autowired
  VeiculoService veiculoService;

  @PostMapping(value = "veiculo")
  public String createVeiculo(@RequestBody Veiculo body) {
    veiculoService.createVeiculo(body);
    return "Veiculo cadastrado com sucesso!";
  }

  @GetMapping(value="veiculo")
  public List<Veiculo> getAllVeiculos() {
    return veiculoService.getAllVeiculos();
  }

  @PutMapping(value = "veiculo")
  public String updateVeiculo(@RequestBody Veiculo body) {
    veiculoService.updateVeiculo(body);
    return "Veiculo atualizado com sucesso!";
  }

  @DeleteMapping(value = "veiculo")
  public String deleteVeiculo() {
    veiculoService.deleteAllVeiculo();
    return "Todos os veiculos deletados com sucesso!";
  }
}