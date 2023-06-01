package com.epicode.esercizioSping.godfatherspizza.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.esercizioSping.godfatherspizza.model.Tavolo;

@Configuration
public class TavoloConfiguration {
		
	@Bean
	@Scope("prototype")
	public Tavolo tavolo(Integer numeroTavolo,Integer maxPersone) {
		return new Tavolo(numeroTavolo,maxPersone);
	}
	
//	@Bean
//	@Scope("prototype")
//	public Tavolo tavolo() {
//		return new Tavolo();
//	}
}
