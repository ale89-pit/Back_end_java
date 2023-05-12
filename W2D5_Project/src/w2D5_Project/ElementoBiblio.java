package w2D5_Project;

import java.time.LocalDate;
import java.util.Date;

public abstract class ElementoBiblio {
	private final String ISBN;
	private String title;
	private LocalDate annoPublicazione;
	private int numeroPagine;
	
	public ElementoBiblio(String iSBN, String title, LocalDate annoPublicazione, int numeroPagine) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.annoPublicazione = annoPublicazione;
		this.numeroPagine = numeroPagine;
	}
	
	
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getAnnoPublicazione() {
		return annoPublicazione;
	}
	public void setAnnoPublicazione(LocalDate annoPublicazione) {
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
		return "ElementoBiblio [ISBN=" + ISBN + ", title=" + title + ", annoPublicazione=" + annoPublicazione
				+ ", numeroPagine=" + numeroPagine + "]";
	}

}