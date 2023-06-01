package com.epicode.esercizioSping.godfatherspizza.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ordine {
	
	private Integer numeroOrdine;
	private Tavolo tavolo;
	private List<FoodItem> listaordine;
	private StatoOrdine statoOrdine ;
	private Integer numeroCoperti = 1;
	private double costoCoperto;
	private LocalDateTime orario ;
	private double totale;
	
	
	public Ordine(Integer numeroOrdine, Tavolo tavolo,Integer numeroCoperti,double costoCoperto) throws Exception {
		super();
		this.numeroOrdine = numeroOrdine;
		this.tavolo = tavolo;
		this.tavolo.setOccupato(true);
		this.listaordine = new ArrayList<FoodItem>();
		this.statoOrdine= StatoOrdine.IN_CORSO;
		this.numeroCoperti = controlloCoperti(numeroCoperti);
		this.costoCoperto = costoCoperto;
		this.orario= LocalDateTime.now();
		this.totale = getTotale();
		
	}
	
	public int controlloCoperti(int coperti) throws Exception {
		if(this.tavolo.getMaxPersone() < coperti ) {
			throw new Exception("Numero di coperti errato!!!!");
		} else {
			return coperti;
		}
	}
	
	public double getTotale() {
		double totale = 0;
		double costoCoperti = this.costoCoperto * this.numeroCoperti;
		for (FoodItem food : this.listaordine) {
			totale +=food.getPrice(); 
		}
		
		return totale + costoCoperti;
	}
	

}
