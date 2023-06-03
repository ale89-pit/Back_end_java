package com.GestionePrenotazioni.Project.service;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.Prenotazione;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.repository.PrenotazioneDAO;



@Service
public class PrenotazioneService {
	Logger log = LoggerFactory.getLogger(PrenotazioneService.class);
	@Autowired @Qualifier("prenotazioneBean") ObjectProvider<Prenotazione> prenotazioneProvider;
	@Autowired private PrenotazioneDAO prenotazione_dao;
	
	public Prenotazione creaPrenotazione(Utente utente,Postazione postazione,LocalDate dataPrenotazione) {
		return prenotazioneProvider.getObject(utente,postazione,dataPrenotazione);
	}
	
	public void insertPrenotazione(Prenotazione p) {
		List<Prenotazione> listagiornoPosta = this.findByGiornoPrenotazioneAndPostazione(p.getGiornoPrenotazione(), p.getPostazione());
		List<Prenotazione> listagiornoUtente = this.findByGiornoPrenotazioneAndUtente(p.getGiornoPrenotazione(), p.getUtente());
		
		if(listagiornoPosta.size() == 0) {
			
			if(listagiornoUtente.size() == 0) {
				prenotazione_dao.save(p);
		}else {
			System.out.println("Hai gia una prenotazione in questa data!!!");
			log.info("L'utente ha gia una prenotazione nella stessa data");
		}
			
		}else {
			System.out.println("La postazione è gia prenotata!!");
			log.info("Postazione gia occupata per la data di prenotazione");
		}
		
	}
	

	
	public Prenotazione getByID(Integer id) {
		 return	prenotazione_dao.findById(id).get();
		}
	
	
	public List <Prenotazione>  findByGiornoPrenotazioneAndPostazione(LocalDate data,Postazione p) {
		return prenotazione_dao.findByGiornoPrenotazioneAndPostazione(data, p);
	}
	
	public List <Prenotazione>  findByGiornoPrenotazioneAndUtente(LocalDate data,Utente u) {
		return prenotazione_dao. findByGiornoPrenotazioneAndUtente(data, u);
	}
	
	public List<Prenotazione> getAll() {
		 return	prenotazione_dao.findAll();
		}
}
