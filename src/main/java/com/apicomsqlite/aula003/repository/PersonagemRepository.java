package com.apicomsqlite.aula003.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apicomsqlite.aula003.enity.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {
    public List<Personagem> findAll();
}