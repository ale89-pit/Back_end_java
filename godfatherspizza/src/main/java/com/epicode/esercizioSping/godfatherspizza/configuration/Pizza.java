package com.epicode.esercizioSping.godfatherspizza.configuration;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pizza {
	
		private String nome;
		private Integer calories;
		private Double price;
		private List<Topping> ingredienti;
		
		
		

}
