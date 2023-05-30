package com.epicode.esercizioSping.godfatherspizza.configuration;

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
public class Drinks {
		private String name;
		private Integer calories;
		private Double price;
		private Double formato;
		private Double alcoolPercent;
		
		
		public Drinks(String name,Integer calories, Double price, Double formato) {
			
			this.name = name;
			this.calories = calories;
			this.price = price;
			this.formato = formato;
		}
		
		
}
