package com.GestionePrenotazioni.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionePrenotazioni.Project.model.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
