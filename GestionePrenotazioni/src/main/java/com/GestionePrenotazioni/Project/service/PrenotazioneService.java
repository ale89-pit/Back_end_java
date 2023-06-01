package com.GestionePrenotazioni.Project.service;

import java.time.LocalDate;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.Prenotazione;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.repository.PrenotazioneDAO;

@Service
public class PrenotazioneService {
	
	@Autowired @Qualifier("prenotazioneBean") ObjectProvider<Prenotazione> prenotazioneProvider;
	@Autowired private PrenotazioneDAO prenotazione_dao;
	
	public Prenotazione creaPrenotazione(Utente utente,Postazione postazione,LocalDate dataPrenotazione) {
		return prenotazioneProvider.getObject(utente,postazione,dataPrenotazione);
	}
	
	public void insertPrenotazione(Prenotazione p) {
		prenotazione_dao.save(p);
	}
}
