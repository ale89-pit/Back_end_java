package w2D5_Project;

import java.time.LocalDate;
import java.util.Date;

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
	
	
}
