package com.Gestione_Incendi.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CentroControllo implements ObserverCentroControllo {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;
	private String nome;
	private String news;
	
	
	@Override
	public void update(Object news) {
		this.setNews((String) news);
		System.out.println(news);
		
	}
}