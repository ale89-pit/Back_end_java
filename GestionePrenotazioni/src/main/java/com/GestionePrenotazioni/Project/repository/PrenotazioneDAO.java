package com.GestionePrenotazioni.Project.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.Prenotazione;
import com.GestionePrenotazioni.Project.model.Utente;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

	

	public List<Prenotazione> findByGiornoPrenotazioneAndPostazione(LocalDate data, Postazione p) ;
	public List<Prenotazione> findByGiornoPrenotazioneAndUtente(LocalDate data, Utente u) ;
}
