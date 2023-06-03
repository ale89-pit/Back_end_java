package com.GestionePrenotazioni.Project.runner;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.Prenotazione;
import com.GestionePrenotazioni.Project.model.TipoPostazione;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.service.EdificioService;
import com.GestionePrenotazioni.Project.service.PostazioneService;
import com.GestionePrenotazioni.Project.service.PrenotazioneService;
import com.GestionePrenotazioni.Project.service.UtenteService;
import com.github.javafaker.Faker;
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
		
//		for(int i = 0;i<4;i++) {
//			Utente u = listaUtenti.get(Faker.instance().random().nextInt(0, 9));
			Utente u = utenteService.getByID(5);
//			Postazione p = listaPostazioni.get(Faker.instance().random().nextInt(0, 4));
			Postazione p = postazioneService.getByID(2);
//			Prenotazione prenotazione = prenotazioneService.creaPrenotazione(u, p,Faker.instance().date().future(10, TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			Prenotazione prenotazione = prenotazioneService.creaPrenotazione(u, p,LocalDate.of(2023, 6, 10));
			prenotazioneService.insertPrenotazione(prenotazione);
			
//		}
		
		
		
//		System.out.println(u);
//		System.out.println(p);
////		Prenotazione prenotazione = prenotazioneService.getByID(1);
//		System.out.println(prenotazione);
//		Prenotazione prenotazionedb = prenotazioneService.getByID(2);
//		u.getListaPrenotazioni().add(prenotazione);
//		utenteService.updateUtente(u);
//		System.out.println(u);
//		 System.out.println(u.getListaPrenotazioni().size());
//		List<Prenotazione> lista = prenotazioneService.findByGiornoPrenotazioneAndPostazione(prenotazione.getGiornoPrenotazione(), p);
//		
//		System.out.println(lista.size());
		
	}

}
