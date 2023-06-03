package com.GestionePrenotazioni.Project.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni.Project.model.Edificio;
import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.TipoPostazione;
import com.GestionePrenotazioni.Project.service.EdificioService;
import com.GestionePrenotazioni.Project.service.PostazioneService;
import com.github.javafaker.Faker;

@Component
public class PostazioneRunner implements ApplicationRunner {
	@Autowired private EdificioService edificioService;
	@Autowired private PostazioneService postazioneService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Postazione Run........");
		List<Edificio> listaEdifici = edificioService.getAll();
//	System.out.println(listaEdifici.get(1));
	
	
//	for(int i = 0;i<5;i++) {
//		
//		String descrizione = Faker.instance().lorem().sentence();
//		Integer numeroMax = Faker.instance().random().nextInt(1,50 );
//		TipoPostazione tipo = (numeroMax >1 & numeroMax <=10)  ? TipoPostazione.PRIVATO: numeroMax>11 & 		numeroMax <= 25? TipoPostazione.OPENSPACE:TipoPostazione.SALA_RIUNIONI;
//		Integer numeroRandomEdificio = Faker.instance().random().nextInt(1,listaEdifici.size()-1);
//		
//	
//		Postazione p1 = postazioneService.createPostazione(descrizione, tipo, listaEdifici.get(numeroRandomEdificio),numeroMax);
//		
//		postazioneService.insertPostazione(p1);
//	}
	}

}
