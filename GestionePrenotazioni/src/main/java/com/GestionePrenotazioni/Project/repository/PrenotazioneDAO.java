package com.GestionePrenotazioni.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionePrenotazioni.Project.model.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
