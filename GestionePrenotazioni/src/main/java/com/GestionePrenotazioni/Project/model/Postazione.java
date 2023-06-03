package com.GestionePrenotazioni.Project.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name= "postazioni")
public class Postazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String descrizione;
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;
	
	@ManyToOne
	private Edificio edificio;
	@Column(nullable = false)
	private Integer numMaxPostazioni;

	
	
	
	public Postazione(String descrizione, TipoPostazione tipo, Edificio edificio, Integer numMaxPostazioni) {
		super();
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.edificio = edificio;
		this.numMaxPostazioni = numMaxPostazioni;
	}




	@Override
	public String toString() {
		return "Postazione [id=" + id + ", descrizione=" + descrizione + ", tipo=" + tipo + ", numMaxPostazioni="
				+ numMaxPostazioni + "]";
	}
	
	
}
