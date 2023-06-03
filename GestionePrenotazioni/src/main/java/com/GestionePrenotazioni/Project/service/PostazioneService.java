package com.GestionePrenotazioni.Project.service;

import java.util.List;

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

	@Autowired @Qualifier("postazioni_bean") ObjectProvider<Postazione> postazioneProvider;
	@Autowired private PostazioneDAO postazione_dao;
	
	public Postazione createPostazione(String descrizione,TipoPostazione tipo,Edificio edificio,Integer numMax) {
		return postazioneProvider.getObject(descrizione,tipo,edificio,numMax);
	}
	
	

	public void insertPostazione(Postazione p) {
		postazione_dao.save(p);
		System.out.println(p.getTipo() + " "+ p.getEdificio().getCitta() +""+p.getEdificio().getIndirizzo()+" "+p.getNumMaxPostazioni() + " INSERITO NEL DB");
	}
	public void updatePostazione(Postazione p) {
		postazione_dao.save(p);
		
		System.out.println(p.getTipo() + " "+ p.getEdificio().getCitta() +""+p.getEdificio().getIndirizzo()+" "+p.getNumMaxPostazioni() + " modificato NEL DB");
	}
//	public void deleteUtente(Utente u) {
//		utente_dao.delete(u);
//	}
//	public Utente getByID(Integer id) {
//	 return	utente_dao.findById(id).get();
//	}
	public List<Postazione> getAll() {
		 return	postazione_dao.findAll();
		}
}
