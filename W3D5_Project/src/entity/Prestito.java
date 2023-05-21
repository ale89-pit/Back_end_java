package entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Prestito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Utente utente;
	@OneToOne
	
	private ElementoBiblio elementoPrestato;
	@Column(name="data_inizio_prestito")
	private LocalDate dataInizioPrestito; 
	@Column(name="data_restituzione_prevista")
	private LocalDate dataRestituzionePrevista ;
	@Column(name="data_restituzione_effettiva")
	private LocalDate dataRestituzioneEffettiva;
	
	
	public Prestito() {
		super();
	}


	public Prestito(Utente utente, ElementoBiblio elementoPrestato) {
		super();
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.dataInizioPrestito = LocalDate.now();
		this.dataRestituzionePrevista =dataInizioPrestito.plusDays(30);
	}


	public Prestito(Utente utente, ElementoBiblio elementoPrestato, LocalDate dataInizioPrestito) {
		super();
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista =dataInizioPrestito.plusDays(30);
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Utente getUtente() {
		return utente;
	}


	public void setUtente(Utente utente) {
		this.utente = utente;
	}


	public ElementoBiblio getElementoPrestato() {
		return elementoPrestato;
	}


	public void setElementoPrestato(ElementoBiblio elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}


	public LocalDate getDataInizioPrestito() {
		return dataInizioPrestito;
	}


	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}


	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}


	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}


	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}


	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}


	@Override
	public String toString() {
		return "Prestito [id=" + id + ", utente=" + utente + ", elementoPrestato=" + elementoPrestato
				+ ", dataInizioPrestito=" + dataInizioPrestito + ", dataRestituzionePrevista="
				+ dataRestituzionePrevista + ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva + "]";
	}
	
	
}
