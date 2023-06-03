package com.GestionePrenotazioni.Project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.TipoPostazione;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.repository.UtenteDAO;

@Service
public class UtenteService {
	Logger log = LoggerFactory.getLogger(UtenteService.class);
	@Autowired UtenteDAO utente_dao;
	
	@Autowired @Qualifier("adminUserBean") ObjectProvider<Utente> userAdminProvider;
	@Autowired @Qualifier("fakeUserBean") ObjectProvider<Utente> userFakeProvider;
	@Autowired @Qualifier("customUserBean") ObjectProvider<Utente> userCustomProvider;
	
	public Utente createAdminUser() {
		return userAdminProvider.getObject();
	}
	
	public Utente createFakeUser() {
		return userFakeProvider.getObject();
	}
	public Utente createCustomUser() {
		return userCustomProvider.getObject();
	}
	
	public void insertUtente(Utente u) {
		utente_dao.save(u);
		log.info(u.getNome() + " "+ u.getCognome() + " INSERITO NEL DB");
	}
	public void updateUtente(Utente u) {
		utente_dao.save(u);
		log.info(u.getNome() + " "+ u.getCognome() + " MODIFICATO NEL DB");
	}
	public void deleteUtente(Utente u) {
		utente_dao.delete(u);
		log.info(u.getNome() +" "+ u.getCognome()+" "+u.getUserName()+" eliminato correttamente");
	}
	public Utente getByID(Integer id) {
	 return	utente_dao.findById(id).get();
	}
	public List<Utente> getAll() {
		 return	utente_dao.findAll();
		}
	public List<Postazione> findPostazioneCitta(TipoPostazione tipo, String citta){
		List<Postazione> listaSearch = utente_dao.findPostazioneCitta(tipo, citta);
		return listaSearch;
	}
}
