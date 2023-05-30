package com.epicode.esercizioSping.godfatherspizza.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationTopping {

		@Bean
		@Scope("prototype")
		public Topping topping(String name,Integer calories, Double price) {
			return new Topping(name,calories,price);
		}
}
