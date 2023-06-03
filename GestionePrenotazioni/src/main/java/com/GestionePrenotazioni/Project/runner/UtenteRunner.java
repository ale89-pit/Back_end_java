package com.GestionePrenotazioni.Project.runner;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni.Project.model.TipoPostazione;
import com.GestionePrenotazioni.Project.model.Utente;
import com.GestionePrenotazioni.Project.service.UtenteService;

@Component
public class UtenteRunner implements ApplicationRunner {

	
	@Autowired private UtenteService utenteService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Utente Run....");
//		utenteService.findPostazioneCitta(TipoPostazione.OPENSPACE, "Quasimodo lido").forEach(a->System.out.println(a.getId()+" " +a.getEdificio()));
		Utente u = utenteService.getByID(4);
		System.out.println(u.getListaPrenotazioni().size());
		//		Utente u1 = utenteService.createAdminUser();
//		utenteService.insertUtente(u1);
//		for(int i =0;i<10;i++) {
//			Utente u2 = utenteService.createFakeUser();
//			utenteService.insertUtente(u2);
//		}
//		Utente u2 = utenteService.createFakeUser();
//		Utente u3 = utenteService.createCustomUser();
//		
//		u3.setCognome("Finocchiaro");
//		u3.setEmail("dajetutta@pippo.com");
//		u3.setNome("Angela");
//		u3.setUserName("angioletta3333");
//		
//		System.out.println(u1);
//		System.out.println(u2);
//		System.out.println(u3);
//	
//		utenteService.insertUtente(u2);
//		utenteService.insertUtente(u3);
	}

}
