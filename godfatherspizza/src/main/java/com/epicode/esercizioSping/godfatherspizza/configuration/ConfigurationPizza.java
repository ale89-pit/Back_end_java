package com.epicode.esercizioSping.godfatherspizza.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationPizza {
	
	@Bean
	public Pizza pizza( String nome,Integer calories,Double price,List<Topping> ingredienti) {
		return new Pizza(nome,calories,price,ingredienti);
	}
}
