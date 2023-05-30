package com.epicode.esercizioSping.godfatherspizza.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationDrinks {
	
	@Bean
	@Scope("prototype")
	public Drinks drink(String name, Integer calories, Double price,Double formato) {
		return new Drinks(name,calories,price,formato);
	}
	@Bean
	@Scope("prototype")
	public Drinks alcolicDrink(String name, Integer calories, Double price,Double formato,Double alcoolPercent) {
		return new Drinks(name,calories,price,formato,alcoolPercent);
	}
}
