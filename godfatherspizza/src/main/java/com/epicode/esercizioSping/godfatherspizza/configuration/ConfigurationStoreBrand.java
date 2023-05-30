package com.epicode.esercizioSping.godfatherspizza.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationStoreBrand {
	
	
	@Bean
	@Scope("prototype")
	public StoreBrand product(String name, Double price) {
		return new StoreBrand(name,price);
	}
}
