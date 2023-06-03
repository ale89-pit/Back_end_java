package com.GestionePrenotazioni.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioni.Project.model.Edificio;
@Repository
public interface EdificioDAO extends JpaRepository<Edificio, Integer> {

}
