package com.epicode.esercizioSping.godfatherspizza.configuration;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.epicode.esercizioSping.godfatherspizza.model.FoodItem;
import com.epicode.esercizioSping.godfatherspizza.model.Menu;
import com.epicode.esercizioSping.godfatherspizza.model.Ordine;
import com.epicode.esercizioSping.godfatherspizza.model.Tavolo;

@Configuration
@PropertySource("classpath:application.properties")
public class OrderConfiguration {
	@Value("${tavolo.coperto.costo}") public Double costoCoperto;

	@Bean
	@Scope("prototype")
	public Ordine ordine(Integer numeroOrdine, Tavolo tavolo, Integer numeroCoperti) throws Exception {

		return new Ordine(numeroOrdine, tavolo,  numeroCoperti,costoCoperto);
	}
}
