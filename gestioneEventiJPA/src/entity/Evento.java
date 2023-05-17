package entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.TipoEvento;

@Entity
@Table(name = "eventi")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String titolo;
	
	@Column(name = "data_evento",nullable = false)
	private LocalDate dataEvento;
	
	private String descrizione;
	
	@Column(name = "tipo_evento" ,nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoEvento tipoEvento;
	
	@Column(name = "max_partecipanti",nullable = false)
	private Integer maxPartecipanti;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Location location;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Set<Partecipazione> listaPartecipazione;
	
	
	public Evento() {
		super();
	}


	public Evento(String titolo, LocalDate dataEvento, String descrizione,TipoEvento tipoEvento, Integer maxPartecipanti) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.maxPartecipanti = maxPartecipanti;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public Integer getId() {
		return id;
	}



	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public LocalDate getDataEvento() {
		return dataEvento;
	}


	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}


	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}


	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}


	public Integer getMaxPartecipanti() {
		return maxPartecipanti;
	}


	public void setMaxPartecipanti(Integer maxPartecipanti) {
		this.maxPartecipanti = maxPartecipanti;
	}


	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", tipoEvento=" + tipoEvento
				+",Descrizione = "+ descrizione + ", maxPartecipanti=" + maxPartecipanti + "]";
	}
	
	
	
}
