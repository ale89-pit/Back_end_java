package com.GestionePrenotazioni.Project.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="prenotazioni")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Utente utente;
	@ManyToOne(fetch = FetchType.EAGER)
	private Postazione postazione;
	private LocalDate giornoPrenotazione;
	private LocalDate scadenzaPrenotazione;
	

	public Prenotazione(Utente utente, Postazione postazione, LocalDate giornoPrenotazione) {
		super();
		this.utente = utente;
		this.postazione = postazione;
		this.giornoPrenotazione = giornoPrenotazione;
		this.scadenzaPrenotazione = giornoPrenotazione.plusDays(1);
	}
	
	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", utente=" + utente + ", giornoPrenotazione=" + giornoPrenotazione
				+ ", scadenzaPrenotazione=" + scadenzaPrenotazione +  "]";
	}
	
	
}
