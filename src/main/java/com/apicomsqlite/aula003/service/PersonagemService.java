package com.apicomsqlite.aula003.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicomsqlite.aula003.enity.Personagem;
import com.apicomsqlite.aula003.repository.PersonagemRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonagemService {
    
    @Autowired()
    private PersonagemRepository personagemRepository;

    @Transactional()
    public String createPersonagem(Personagem personagem) {
        personagemRepository.save(personagem);
        return "Personagem salvo com sucesso";
    } 

    @Transactional()
    public List<Personagem> getAllPersonagens() {
        return personagemRepository.findAll();
    }

    @Transactional()
    public void deleteAllPersonagem() {
        personagemRepository.deleteAll();
    }

    @Transactional()
    public void updatePersonagem(Personagem personagem) {
        Personagem personagemUpdate = personagemRepository.getReferenceById(personagem.getId());
        personagemUpdate.setNivel(personagem.getNivel());
        personagemUpdate.setNome(personagem.getNome());
        personagemUpdate.setClasse(personagem.getClasse());
        personagemRepository.save(personagemUpdate);
    }
}
