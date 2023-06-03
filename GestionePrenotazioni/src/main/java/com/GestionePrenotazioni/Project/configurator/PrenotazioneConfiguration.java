package com.GestionePrenotazioni.Project.configurator;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.GestionePrenotazioni.Project.model.Postazione;
import com.GestionePrenotazioni.Project.model.Prenotazione;
import com.GestionePrenotazioni.Project.model.Utente;

@Configuration
public class PrenotazioneConfiguration {

		@Bean(name="prenotazioneBean")
		@Scope("prototype")
		public Prenotazione prenotazione(Utente utente,Postazione postazione,LocalDate dataPrenotazione) {
			return new Prenotazione(utente,postazione,dataPrenotazione);
		}
		
		
}
