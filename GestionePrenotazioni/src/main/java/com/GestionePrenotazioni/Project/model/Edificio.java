package com.GestionePrenotazioni.Project.model;

import java.util.ArrayList;
import java.util.List;

import com.GestionePrenotazioni.Project.Security.configurator.SecretCodeConvert;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
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
	@Column(name= "secret_code")
	@Size(min=8 ,max= 12)
	@Convert(converter = SecretCodeConvert.class)
	private String secretCode;
	private Boolean active;
	@OneToMany(mappedBy ="edificio",fetch = FetchType.EAGER )
	@JsonIgnore
	private List<Postazione> listaPostazioni = new ArrayList<Postazione>();
	
	
	public Edificio(String nome, String indirizzo, String citta) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
		
	}


	@Override
	public String toString() {
		return "Edificio [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + ", citta=" + citta + "]";
	}
	
	
}
