package com.apicomsqlite.aula003.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apicomsqlite.aula003.enity.Personagem;
import com.apicomsqlite.aula003.service.PersonagemService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController()
public class PersonagemController {

  @Autowired
  PersonagemService personagemService;

  @PostMapping(value = "personagem")
  public String createPersonagem(@RequestBody Personagem body) {
    personagemService.createPersonagem(body);
    return "Personagem cadastrado com sucesso!";
  }

  @GetMapping(value="personagem")
  public List<Personagem> getAllPersonagems() {
    return personagemService.getAllPersonagens();
  }

  @PutMapping(value = "personagem")
  public String updatePersonagem(@RequestBody Personagem body) {
    personagemService.updatePersonagem(body);
    return "Personagm atualizado com sucesso!";
  }

  @DeleteMapping(value = "personagem")
  public String deletePersonagem() {
    personagemService.deleteAllPersonagem();
    return "Todos os personagens deletados com sucesso!";
  }
}