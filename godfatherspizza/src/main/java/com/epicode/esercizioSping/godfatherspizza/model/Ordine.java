package com.epicode.esercizioSping.godfatherspizza.model;

import java.time.LocalTime;
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
	private LocalTime orario;
	private double totale;
	private Integer numeroCoperti;
	private Map<FoodItem,String> listaordine_note;
	private StatoOrdine statoOrdine;
	
	
	

}
