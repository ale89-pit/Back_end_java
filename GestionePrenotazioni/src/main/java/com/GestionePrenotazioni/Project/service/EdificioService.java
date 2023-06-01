package com.GestionePrenotazioni.Project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.Project.configurator.EdificioConfiguration;
import com.GestionePrenotazioni.Project.model.Edificio;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.repository.EdificioDAO;

@Service
public class EdificioService {
	
		@Autowired EdificioDAO edificio_dao;

		@Autowired @Qualifier("edificioBean") ObjectProvider<Edificio> edificioProvider;
		
		public Edificio createEdificio() {
			return edificioProvider.getObject();
		}
		
		public void insertEdificio(Edificio e) {
			edificio_dao.save(e);
		}
		
		public void updateEdificio(Edificio e) {
			edificio_dao.save(e);
		}
		public void deleteEdificio(Edificio e) {
			edificio_dao.delete(e);
		}
		public Edificio getById(Integer id) {
			return edificio_dao.findById(id).get();
		}
		public List<Edificio> getAll(){
			return edificio_dao.findAll();
		}
		
}
