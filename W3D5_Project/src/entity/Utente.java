package entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Utente {
	
	@Id
	@SequenceGenerator(name="numero_utente_seq",initialValue = 1000, sequenceName = "numero_utente_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="numero_utente_seq")
	private Integer numeroTessera;
	
	private String nome;
	private String cognome;
	@Column(name="anno_nascita")
	private LocalDate annoNascita;
	
	
	
	
	public Utente() {
		super();
	}



	public Utente(String nome, String cognome, LocalDate annoNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
	}



	public Integer getNumeroTessera() {
		return numeroTessera;
	}



	public void setNumeroTessera(Integer numeroTessera) {
		this.numeroTessera = numeroTessera;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public LocalDate getAnnoNascita() {
		return annoNascita;
	}



	public void setAnnoNascita(LocalDate annoNascita) {
		this.annoNascita = annoNascita;
	}



	@Override
	public String toString() {
		return "Utente [numeroTessera=" + numeroTessera + ", nome=" + nome + ", cognome=" + cognome + ", annoNascita="
				+ annoNascita + "]";
	}
	
	
}
