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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "eventi")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
@NamedQuery(name = "findAllEventi", query ="SELECT ev FROM Evento ev")
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
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Location location;
	
	@OneToMany(mappedBy="evento",cascade = CascadeType.REMOVE)
	private Set<Partecipazione> setPartecipazioni;
	
	
	public Evento() {
		super();
	}



	public Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			Integer maxPartecipanti, Location location, Set<Partecipazione> setPartecipazione) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.maxPartecipanti = maxPartecipanti;
		this.location = location;
		this.setPartecipazioni = setPartecipazione;
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



	public Location getLocation() {
		return location;
	}



	public void setLocation(Location location) {
		this.location = location;
	}



	public Set<Partecipazione> getSetPartecipazioni() {
		return setPartecipazioni;
	}



	public void setSetPartecipazioni(Set<Partecipazione> setPartecipazioni) {
		this.setPartecipazioni = setPartecipazioni;
	}



	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", descrizione=" + descrizione
				+ ", tipoEvento=" + tipoEvento + ", maxPartecipanti=" + maxPartecipanti + ", location=" + location
				+ ", setPartecipazioni=" + setPartecipazioni + "]";
	}



	
	
	
}
