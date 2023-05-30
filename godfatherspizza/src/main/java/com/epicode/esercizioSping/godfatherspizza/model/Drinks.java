package com.epicode.esercizioSping.godfatherspizza.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class Drinks extends FoodItem {
	
		public Drinks(String name,double price,double calories) {
			super(name,price,calories);
		}
		
	
		public Drinks() {
			super();
		}
}
