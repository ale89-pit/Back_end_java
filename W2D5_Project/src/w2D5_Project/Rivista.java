package w2D5_Project;

import java.time.LocalDate;


public class Rivista extends ElementoBiblio{
	Periodicita periodicita;

	

	public Rivista(String iSBN, String title, LocalDate annoPublicazione, int numeroPagine, Periodicita periodicita) {
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
