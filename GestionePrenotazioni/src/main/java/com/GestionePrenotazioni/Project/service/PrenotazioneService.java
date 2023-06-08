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
import com.GestionePrenotazioni.Project.repository.UtenteDAO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EntityExistsException;



@Service
public class PrenotazioneService {
	Logger log = LoggerFactory.getLogger(PrenotazioneService.class);
	@Autowired @Qualifier("prenotazioneBean") ObjectProvider<Prenotazione> prenotazioneProvider;
	@Autowired private PrenotazioneDAO prenotazione_dao;
	@Autowired private UtenteService utenteService;
	
	public Prenotazione creaPrenotazione(Utente utente,Postazione postazione,LocalDate dataPrenotazione) {
		return prenotazioneProvider.getObject(utente,postazione,dataPrenotazione);
	}
	
	public Prenotazione insertPrenotazione(Prenotazione p) {
		
//		List<Prenotazione> listagiornoPosta = this.findByGiornoPrenotazioneAndPostazione(p.getGiornoPrenotazione(), p.getPostazione());
//		List<Prenotazione> listagiornoUtente = this.findByGiornoPrenotazioneAndUtente(p.getGiornoPrenotazione(), p.getUtente());
//		
		if(prenotazione_dao.findByGiornoPrenotazioneAndPostazione(p.getGiornoPrenotazione(), p.getPostazione()).size() == 0) {
//			
			if(prenotazione_dao.findByGiornoPrenotazioneAndUtente(p.getGiornoPrenotazione(), p.getUtente()).size() == 0) {
			p.setScadenzaPrenotazione(p.getGiornoPrenotazione().plusDays(1));
				Prenotazione nuova = prenotazione_dao.save(p);
				p.getUtente().getListaPrenotazioni().add(p);
				utenteService.updateUtente(p.getUtente());
				return nuova;
				
		}else {
			log.info("L'utente ha gia una prenotazione nella stessa data");
			throw new EntityExistsException("L'utente ha gia una prenotazione in questa data");
			
		}
			
		}else {
			System.out.println("La postazione è gia prenotata!!");
			log.info("Postazione gia occupata per la data di prenotazione");
			throw new EntityExistsException("Postazione gia occupata per questa data");
			
		}
		
	}
	
	
	public Prenotazione updatePrenotazione(Prenotazione p) {
		p.setScadenzaPrenotazione(p.getGiornoPrenotazione().plusDays(1));
		return prenotazione_dao.save(p);
	}
	
	

	
	public Prenotazione getByID(Integer id) {
		 return	prenotazione_dao.findById(id).get();
		}
	public void deletePrenotazione(Integer id) {
		prenotazione_dao.deleteById(id);
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
