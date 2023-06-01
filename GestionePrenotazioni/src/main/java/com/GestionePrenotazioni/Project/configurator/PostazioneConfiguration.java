package com.GestionePrenotazioni.Project.configurator;

import java.util.List;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.GestionePrenotazioni.Project.model.Edificio;
import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.TipoPostazione;


@Configuration
public class PostazioneConfiguration {
	

	
	
		@Bean("postazioni_bean")
		@Scope("prototype")
		public Postazione postazioni(String descrizione,TipoPostazione tipo,Edificio edificio,Integer numMax) {
			return new Postazione(descrizione,tipo,edificio,numMax);
		}
}
