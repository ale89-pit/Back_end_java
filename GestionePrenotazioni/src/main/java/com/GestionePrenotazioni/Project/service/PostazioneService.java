package com.GestionePrenotazioni.Project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.Project.model.Edificio;
import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.TipoPostazione;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.repository.PostazioneDAO;
import com.GestionePrenotazioni.Project.repository.PrenotazioneDAO;

@Service
public class PostazioneService {
	Logger log = LoggerFactory.getLogger(PostazioneService.class);
	@Autowired
	@Qualifier("postazioni_bean")
	ObjectProvider<Postazione> postazioneProvider;
	@Autowired
	private PostazioneDAO postazione_dao;

	public Postazione createPostazione(String descrizione, TipoPostazione tipo, Edificio edificio, Integer numMax) {
		return postazioneProvider.getObject(descrizione, tipo, edificio, numMax);
	}

	public void insertPostazione(Postazione p) {
		postazione_dao.save(p);

		log.info(p.getTipo() + " " + p.getEdificio().getCitta() + "" + p.getEdificio().getIndirizzo() + " "
				+ p.getNumMaxPostazioni() + " INSERITO NEL DB");
	}

	public void updatePostazione(Postazione p) {
		postazione_dao.save(p);
		log.info(p.getTipo() + " " + p.getEdificio().getCitta() + "" + p.getEdificio().getIndirizzo() + " "
				+ p.getNumMaxPostazioni() + " MODIFICATO NEL DB");

	}

	public void deletePostazione(Postazione p) {
		postazione_dao.delete(p);
		log.info(p.getTipo() + " " + p.getEdificio().getCitta() + "" + p.getEdificio().getIndirizzo() + " "
				+ p.getNumMaxPostazioni() + " ELIMINATO NEL DB");
	}

	public Postazione getByID(Integer id) {
		return postazione_dao.findById(id).get();
	}

	public List<Postazione> getAll() {
		return postazione_dao.findAll();
	}
}
