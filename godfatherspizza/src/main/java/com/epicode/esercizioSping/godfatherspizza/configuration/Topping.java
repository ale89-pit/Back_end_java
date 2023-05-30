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
public class Topping {

	private String name;
	private Integer calories;
	private Double price;

}
