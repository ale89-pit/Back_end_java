package com.GestionePrenotazioni.Project.configurator;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.GestionePrenotazioni.Project.model.Edificio;
import com.github.javafaker.Faker;

@Configuration
public class EdificioConfiguration {

	
	@Bean(name="edificioBean")
	@Scope("prototype")
	public Edificio edificio() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Edificio edificioFake = new Edificio();
		
		edificioFake.setCitta(fake.address().city());
		edificioFake.setIndirizzo(fake.address().streetAddress());
		edificioFake.setNome(fake.ancient().titan());
		return edificioFake;
	}
}
