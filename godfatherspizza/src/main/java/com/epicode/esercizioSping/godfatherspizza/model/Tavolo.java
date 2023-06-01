package com.epicode.esercizioSping.godfatherspizza.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
@Data
//@Builder
public class Tavolo {
	
	private Integer numeroTavolo;
	private Integer maxPersone;
	private Boolean occupato = false;
	
	
	public Tavolo(Integer numeroTavolo, Integer maxPersone) {
		super();
		this.numeroTavolo = numeroTavolo;
		this.maxPersone = maxPersone;
		this.occupato = false;
	}
	
}
