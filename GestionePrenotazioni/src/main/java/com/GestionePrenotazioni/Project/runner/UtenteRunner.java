package com.GestionePrenotazioni.Project.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.service.UtenteService;

@Component
public class UtenteRunner implements ApplicationRunner {

	
	@Autowired private UtenteService utenteService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

		Utente u1 = utenteService.createAdminUser();
		Utente u2 = utenteService.createFakeUser();
		Utente u3 = utenteService.createCustomUser();
		
		u3.setCognome("Finocchiaro");
		u3.setEmail("dajetutta@pippo.com");
		u3.setNome("Angela");
		u3.setUserName("angioletta3333");
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		
		utenteService.insertUtente(u1);
		utenteService.insertUtente(u2);
		utenteService.insertUtente(u3);
	}

}
