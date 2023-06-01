package com.GestionePrenotazioni.Project.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.Prenotazione;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.service.EdificioService;
import com.GestionePrenotazioni.Project.service.PostazioneService;
import com.GestionePrenotazioni.Project.service.PrenotazioneService;
import com.GestionePrenotazioni.Project.service.UtenteService;
@Component
public class PrenotazioneRunnre implements ApplicationRunner {
	@Autowired private UtenteService utenteService;
	@Autowired private PostazioneService postazioneService;
	@Autowired private PrenotazioneService prenotazioneService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Prenotazione Run........");
		List<Utente> listaUtenti = utenteService.getAll();
		List<Postazione> listaPostazioni = postazioneService.getAll();
		
		
		Utente u = listaUtenti.get(2);
		Postazione p = listaPostazioni.get(0);
		
		Prenotazione prenotazione = prenotazioneService.creaPrenotazione(u, p, LocalDate.of(2023, 6, 9));
		
		prenotazioneService.insertPrenotazione(prenotazione);
	}

}
