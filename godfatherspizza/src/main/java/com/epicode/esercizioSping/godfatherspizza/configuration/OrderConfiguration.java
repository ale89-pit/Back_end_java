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
import com.epicode.esercizioSping.godfatherspizza.model.Stato;
import com.epicode.esercizioSping.godfatherspizza.model.Tavolo;

@Configuration

public class OrderConfiguration {
		//@Value("${tavolo.coperto.costo}") private double costoCoperto;
	
		
		@Bean
		@Scope("prototype")
		public Ordine ordine() {
//			Map<FoodItem,String> prodotti_ordinati = null;
//			prodotti_ordinati.put(new MenuConfiguration().pizzaMargherita(), "Nessuna nota");
//			prodotti_ordinati.put((new MenuConfiguration().pizzaFamilySize(new MenuConfiguration().pizzaMargherita())), "");
//			Ordine o = new Ordine();
//			o.setNumeroCoperti(12);
//			o.setNumeroOrdine(1);
//			o.setListaordine_note(prodotti_ordinati);
//			o.setTavolo(new Tavolo(1,16,Stato.OCCUPATO));
			return new Ordine();
		}
}
