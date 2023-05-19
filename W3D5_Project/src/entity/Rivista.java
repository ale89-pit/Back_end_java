package entity;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("rivista")
public class Rivista extends ElementoBiblio{
	
	@Enumerated(EnumType.STRING)
	Periodicita periodicita;

	

	public Rivista() {
		super();
	}

	public Rivista(String iSBN, String title, Integer annoPublicazione, int numeroPagine, Periodicita periodicita) {
		super(iSBN, title, annoPublicazione, numeroPagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita  periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return  "Rivista :"
						+"ISBN="+ super.getISBN()+","
						+"title=" + super.getTitle()+"," 
						+ "annoPublicazione=" + super.getAnnoPublicazione()+","
						+ "numeroPagine=" + super.getNumeroPagine()+","
						+ "periodicita=" + periodicita + "}" ;
	}
	
	
}
