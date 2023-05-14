package w2D5_Project;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {
	static File file = new File("backup.txt");
//	static File file2 = new File("backup2.txt");
	static String backup = "";
	static List<ElementoBiblio> listaBiblio = new ArrayList<ElementoBiblio>();
	public static Scanner input = new Scanner(System.in);
	static Logger log = LoggerFactory.getLogger(MainProject.class);
	static String isbn;

	public static void main(String[] args) throws IOException {
		ElementoBiblio a = new Book("sdfw324", "titolo111", 1945, 200, "pippo", "a");
		ElementoBiblio b = new Rivista("gtrt453", "titolo2222",1962, 50, Periodicita.MENSILE);
		ElementoBiblio c = new Book("ewew3434", "titolo333", 1989, 200, "pippo", "a");
		ElementoBiblio d = new Rivista("rfgt34", "titolo444",2020,50, Periodicita.SETTIMANALE);
		ElementoBiblio e = new Book("swe4", "titolo555", 2000, 200, "autore", "a");
		ElementoBiblio f = new Rivista("trt534", "titolo666",1995,50, Periodicita.SEMESTRALE);
		ElementoBiblio g = new Book("sdf34324", "titolo777",1999, 200, "recchia", "a");
		ElementoBiblio h = new Rivista("rft4534", "titolo888", 1972, 50, Periodicita.MENSILE);
		listaBiblio.add(a);
		listaBiblio.add(b);
		listaBiblio.add(c);
		listaBiblio.add(d);
		listaBiblio.add(e);
		listaBiblio.add(f);
		listaBiblio.add(g);
		listaBiblio.add(h);
		listaBiblio.forEach(s -> {
			try {
				scriviBackUp(s);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		try {
		int risp;
		System.out.println("digita qualsiasi numero per cominciare, oppure 0->esci");
		risp = Integer.parseInt(input.nextLine());
		
		while (risp != 0){
			
			System.out.println(risp);
			int chose;
			
			
				do {
				System.out.println("Iniziamo");
				System.out.println("1->Inserisci Nuovo Libro/rivista");
				System.out.println("2->Elimina Libro/rivista tramite ISBN");
				System.out.println("3->Cerca");
				System.out.println("4->Backup-print");
				Scanner scelta = new Scanner(System.in);
				chose = Integer.parseInt(scelta.nextLine());
				if(chose <1 | chose>4) {
					System.out.println("Il valore inserito nn esiste!!!Rirpova!!");
				}
			} while (chose < 1 & chose > 4);
				
			switch (chose) {

			case 1:
				addELement();
				break;
			case 2:
				deleteElementByisbn();
				break;
			case 3:
				System.out.println("1->search by ISBN, 2->search by autore,search by date");
				Scanner scelta2 = new Scanner(System.in);
				int searchChois = Integer.parseInt(scelta2.nextLine());
				switch (searchChois) {
				case 1:
					serchByIsbn();
					break;
				case 2:
					searchByAutore();
					break;
				case 3:
					searchByDate();
					break;
				}
			case 4:
				readFromFile();
				break;
			}

		} 
			
		}catch (NumberFormatException ex){
			System.out.println("errore inserimento");
//			ex.printStackTrace();
		}

	}

	public static ElementoBiblio addELement() throws IOException {
		Periodicita per = null;
		Scanner r = new Scanner(System.in);
		ElementoBiblio element;
		List<ElementoBiblio> i;
		int risp;
		do {
			System.out.println("Vuoi inserire un libro->1 o una rivista->2");

			risp = Integer.parseInt(r.nextLine());
		} while (risp > 2 | risp < 1);
		do {
			System.out.println("Insericsci ISBN");
			isbn = r.nextLine();
			i = listaBiblio.stream().filter(e -> e.getISBN().equals(isbn)).collect(Collectors.toList());

		}

		while (i.size() > 0);
		System.out.println("Insericsci Titolo");
		String title = r.nextLine();
		System.out.println("Insericsci Anno Data Pubblicazione");
		int anno = Integer.parseInt(r.nextLine());
//		System.out.println("Insericsci Mese Data Pubblicazione");
//		int mese = Integer.parseInt(r.nextLine());
//		System.out.println("Insericsci Giorno Data Pubblicazione");
//		int day = Integer.parseInt(r.nextLine());
		System.out.println("Insericsci Numero Pargine");
		int pag = Integer.parseInt(r.nextLine());

		if (risp == 1) {
			System.out.println("Insericsci Autore");
			String autore = r.nextLine();
			System.out.println("Insericsci Genere");
			String gender = r.nextLine();
			element = new Book(isbn, title, anno,  pag, autore, gender);
			listaBiblio.add(element);
			scriviBackUp(element);
		} else {
			int risp2;
			do {
				System.out.println("Inserisci Periodicità 1->Sett, 2->Mens, 3->Semestrale");
				risp2 = Integer.parseInt(r.nextLine());
			} while (risp2 < 1 | risp2 > 3);
			switch (risp2) {
			case 1:
				per = Periodicita.SETTIMANALE;
				break;
			case 2:
				per = Periodicita.MENSILE;
				break;
			case 3:
				per = Periodicita.SEMESTRALE;
				break;
			default:
				System.out.println("inserisci un valore valido");

			}

			element = new Rivista(isbn, title, anno, pag, per);
			listaBiblio.add(element);
			scriviBackUp(element);
		}

		return element;
	}

	public static void deleteElementByisbn() {
		listaBiblio.forEach(s -> System.out.println(s));
		System.out.println("Inserisci il codice ISBN del libro da eliminare");

		try (Scanner r = new Scanner(System.in)) {
			String isbn = r.nextLine();
			Optional<ElementoBiblio> e = listaBiblio.stream().filter(el -> el.getISBN().equals(isbn)).findFirst();
			if (e.isPresent()) {
				ElementoBiblio index = e.get();
				listaBiblio.remove(index);
				System.out.println("Eliminato con successo");
				listaBiblio.forEach(s -> System.out.println(s));

			} else {
				System.out.println("L'isbn inserito è errato");
			}
		}

	}

	public static ElementoBiblio serchByIsbn() {
		ElementoBiblio find = null;
		Scanner r = new Scanner(System.in);
		System.out.println("Inserisci il codice ISBN del libro desiderato");
		String isbn = r.nextLine();
		for (ElementoBiblio elementoBiblio : listaBiblio) {
			if (elementoBiblio.getISBN().equals(isbn)) {
				find = elementoBiblio;

				break;
			} else {
				System.out.println("nessun elemento trovato");
			}
			break;
		}
		return find;
	}

	public static List<ElementoBiblio> searchByDate() {
		Scanner r = new Scanner(System.in);
		System.out.println("Inserisci l'anno di pubblicazione");
		int year = Integer.parseInt(r.nextLine());
		List<ElementoBiblio> searchDate = listaBiblio.stream().filter(e -> e.getAnnoPublicazione() == year)
				.collect(Collectors.toList());
		return searchDate;
	}

	public static List<Book> searchByAutore() {
		System.out.println("Inserisci l'anno di pubblicazione");
		Scanner r = new Scanner(System.in);
		String aut = r.nextLine();
		List<ElementoBiblio> searchDate = listaBiblio.stream().filter(e -> e instanceof Book).map(e -> (Book) e)
				.filter(e -> e.getAutore().toLowerCase().contains(aut.toLowerCase())).collect(Collectors.toList());
		return searchDate.stream().map(e -> (Book) e).collect(Collectors.toList());
	}

	public static void scriviBackUp(ElementoBiblio ele) throws IOException {
		if (file.length() != 0) {

			backup = FileUtils.readFileToString(file, "UTF-8");
			backup += ele.toString();
			FileUtils.writeStringToFile(file, backup, "UTF-8");
		} else {
			backup = ele.toString();
			FileUtils.writeStringToFile(file, backup, "UTF-8");
		}

	}

//	public static void scriviBackUpTotale(List<ElementoBiblio> ele) throws IOException {
//
//		FileUtils.writeStringToFile(file2, ele.toString(), "UTF-8");
//
//	}

	
	public static List<ElementoBiblio> readFromFile() throws IOException {
		String read = FileUtils.readFileToString(file, "UTF-8");

		String[] elemento = read.split("}");
		String isbnRst ="";
		String titleRst="" ;
		int nPagRst=0;
		String autoreRst="";
		String genereRst="";
		Integer dateRst=0;
		Periodicita perRst = Periodicita.SEMESTRALE;
		
		for (int i = 0; i < elemento.length;i++) {
			if (elemento[i].contains("Book")) {
				//System.out.println(elemento[i].toString());
				String[] book = elemento[i].split(":");
				//System.out.println("for libri" + book[].toString());
				System.out.print("Book :");
				for (int j = 0; j < book.length;j++) {
//					System.out.println("for libri" + book[j].toString());
					String[] campi = book[j].split(",");
					for(int j1 =0;j1<campi.length;j1++) {
//						System.out.println(campi.length + " " + j1);
						String[]valori = campi[j1].split("=");
//						System.out.println("for libri valore" + valori[0].toString());
						
						for(int j2=1;j2<valori.length;j2++) {
//							System.out.println("campo:"+ j1 + " index : " + j2);
//							System.out.println("for libri  " + valori[j2].toString());
							switch(j1) {
							case 0: isbnRst = valori[j2];break;
							case 1: titleRst = valori[j2];break;
							case 2: dateRst =Integer.parseInt(valori[j2]);break;
							case 3: nPagRst =Integer.parseInt(valori[j2]);break;
							case 4: autoreRst = valori[j2];break;
							case 5: genereRst = valori[j2];listaBiblio.add(new Book(isbnRst,titleRst,dateRst,nPagRst,autoreRst,genereRst));break;
							}
								
							
						}
//						if(j1==campi.length) {
//							
//						}
//						listaBiblio.add(isbnRst,titleRst,LocalDate(2332,3,3),nPagRst,autoreRst,genereRst);
						
					}
					
				}

			} else if(elemento[i].contains("Rivista")) {
				String[] rivista = elemento[i].split(":");
				System.out.print("Rivista :");
				for (int k = 0; k < rivista.length;k++) {
					
//					System.out.println("for rivista " + rivista[k].toString());
					String[] campi = rivista[k].split(",");
					for(int k1 =0;k1<campi.length;k1++) {
//						System.out.println(campi.length+ " " +  k1);
//						System.out.println("campi rivista: " + campi[k1].toString());
						String[]valori = campi[k1].split("=");
//						System.out.println("valori rivista" + valori[1].toString());
						for(int k2=1;k2<valori.length;k2++) {
//							System.out.println("campo:"+ k1 + "v index : " + k2);
//							System.out.println("for rivista " + valori[k2].toString());
							
							switch(k1) {
							
							case 0: isbnRst = valori[k2]; break;
							case 1: titleRst = valori[k2];break;
							case 2: dateRst =Integer.parseInt(valori[k2]);break;
							case 3: nPagRst =Integer.parseInt(valori[k2]);break;
							case 4: perRst = valori[k2].equals("SETTIMANALE") ? Periodicita.SETTIMANALE:valori[k2].equals("MENSILE")? Periodicita.MENSILE:perRst;listaBiblio.add(new Rivista(isbnRst, titleRst,dateRst,nPagRst,perRst));break;
							}
							
								
							
						}
						
						
					}
					
				}
				
				
				
				
				
			}
			
		}
		
		return null;
	}

}
