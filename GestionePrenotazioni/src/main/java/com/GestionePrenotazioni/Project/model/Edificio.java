package com.GestionePrenotazioni.Project.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="edifici")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Edificio {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	 private String indirizzo;
	@Column(nullable = false)
	private String citta;
	
	
}
