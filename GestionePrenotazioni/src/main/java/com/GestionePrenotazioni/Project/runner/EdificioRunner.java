package com.GestionePrenotazioni.Project.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni.Project.model.Edificio;
import com.GestionePrenotazioni.Project.service.EdificioService;

@Component
public class EdificioRunner implements ApplicationRunner {

	@Autowired private EdificioService edificioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Edificio Run....");

//		 List<Edificio> listaEdifici = edificioService.getAll();
		 
//		 listaEdifici.forEach(a->System.out.println(a));
//		 for(int i = 0;i<20;i++) {
//			
//			Edificio edificio = edificioService.createEdificio();
//			edificioService.insertEdificio(edificio);
//		}
	}
	

}
