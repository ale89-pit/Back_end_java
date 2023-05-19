package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class ElementoBiblio {
	
	@Id
	@Column(name = "isbn")
	private String ISBN;
	@Column(nullable = false)
	private String title;
	@Column(name ="anno_pubblicazione",nullable = false)
	private Integer annoPublicazione;
	@Column(name ="numero")
	private int numeroPagine;
	
	
	
	public ElementoBiblio() {
		super();
	}

	public ElementoBiblio(String iSBN, String title, Integer annoPublicazione, int numeroPagine) {
		super();
		this.ISBN = iSBN;
		this.title = title;
		this.annoPublicazione = annoPublicazione;
		this.numeroPagine = numeroPagine;
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	public void setISBN(String isbn) {
		this.ISBN = isbn;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getAnnoPublicazione() {
		return annoPublicazione;
	}
	public void setAnnoPublicazione(Integer annoPublicazione) {
		this.annoPublicazione = annoPublicazione;
	}
	public int getNumeroPagine() {
		return numeroPagine;
	}
	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	
	@Override
	public String toString() {
		return "ISBN=" + ISBN 
				+ "title=" + title 
				+ "annoPublicazione=" + annoPublicazione
				+ "numeroPagine=" + numeroPagine ;
	}

}

