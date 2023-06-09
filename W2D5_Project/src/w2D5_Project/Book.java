package w2D5_Project;

import java.time.LocalDate;




public class Book extends ElementoBiblio{
	
	private String autore;
	private String genere;
	public Book(String iSBN, String title, Integer annoPublicazione, int numeroPagine, String autore, String genere) {
		super(iSBN, title, annoPublicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
		
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	@Override
	public String toString() {
		return  "Book :"
					+"ISBN="+ super.getISBN()+"," 
					+"title=" + super.getTitle()+","
					+"annoPublicazione=" + getAnnoPublicazione()+","
					+"numeroPagine=" + super.getNumeroPagine()+"," 
					+"autore=" + autore+"," 
					+ "genere=" + genere + "}";
	}
	
	

}
