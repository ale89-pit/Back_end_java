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
	static File file2 = new File("backup2.txt");
	static String backup = "";
	static List<ElementoBiblio> listaBiblio = new ArrayList<ElementoBiblio>();
	public static Scanner input = new Scanner(System.in);
	static Logger log = LoggerFactory.getLogger(MainProject.class);
	static String isbn;

	public static void main(String[] args) throws IOException {
		ElementoBiblio a = new Book("sdfw324", "title", LocalDate.of(1945, 3, 23), 200, "pippo", "a");
		ElementoBiblio b = new Rivista("gtrt453", "title", LocalDate.of(1962, 5, 25), 50, Periodicita.MENSILE);
		ElementoBiblio c = new Book("ewew3434", "title", LocalDate.of(1989, 8, 30), 200, "pippo", "a");
		ElementoBiblio d = new Rivista("rfgt34", "title", LocalDate.of(2020, 2, 5), 50, Periodicita.SETTIMANALE);
		ElementoBiblio e = new Book("swe4", "title", LocalDate.of(2000, 12, 13), 200, "autore", "a");
		ElementoBiblio f = new Rivista("trt534", "title", LocalDate.of(1995, 11, 19), 50, Periodicita.SEMESTRALE);
		ElementoBiblio g = new Book("sdf34324", "title", LocalDate.of(1999, 9, 23), 200, "recchia", "a");
		ElementoBiblio h = new Rivista("rft4534", "title", LocalDate.of(1972, 7, 8), 50, Periodicita.MENSILE);
		listaBiblio.add(a);
		listaBiblio.add(b);
		listaBiblio.add(c);
		listaBiblio.add(d);
		listaBiblio.add(e);
		listaBiblio.add(f);
		listaBiblio.add(g);
		listaBiblio.add(h);
		listaBiblio.forEach(s->System.out.println(s));
		scriviBackUpTotale(listaBiblio);
		int risp;
		;
		do {
			System.out.println("1->per cominciare 0->esci");
			risp = input.nextInt();
			int chose;
			do {
				System.out.println("Iniziamo");
				System.out.println("1->Inserisci Nuovo Libro/rivista");
				System.out.println("2->Elimina Libro/rivista tramite ISBN");
				System.out.println("3->Cerca");
				System.out.println("4->Backup-print");
				Scanner scelta = new Scanner(System.in);
				chose = Integer.parseInt(scelta.nextLine());
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

		} while (risp != 0);

	

		

//		ElementoBiblio a =	new Book("sdfw324", "title", LocalDate.of(1945, 3, 23),200 , "pippo", "a");
//		ElementoBiblio b =new Rivista("gtrt453", "title", LocalDate.of(1962, 5, 25),50, Periodicita.MENSILE);
//		ElementoBiblio c =new Book("ewew3434", "title", LocalDate.of(1989, 8, 30),200 , "pippo", "a");
//		ElementoBiblio d =new Rivista("rfgt34", "title", LocalDate.of(2020, 2, 5),50, Periodicita.SETTIMANALE);
//		ElementoBiblio e =new Book("swe4", "title", LocalDate.of(2000, 12, 13),200 , "autore", "a");
//		ElementoBiblio f =new Rivista("trt534", "title", LocalDate.of(1995, 11, 19),50, Periodicita.SEMESTRALE);
//		ElementoBiblio g =new Book("sdf34324", "title", LocalDate.of(1999, 9, 23),200 , "recchia", "a");
//		ElementoBiblio h =new Rivista("rft4534", "title", LocalDate.of(1972, 7, 8),50, Periodicita.MENSILE);
//		listaBiblio.add(a);
//		listaBiblio.add(b);
//		listaBiblio.add(c);
//		listaBiblio.add(d);
//		listaBiblio.add(e);
//		listaBiblio.add(f);
//		listaBiblio.add(g);
//		listaBiblio.add(h);
//		//listaBiblio.add(addELement());
////		addELement();
////		listaBiblio.forEach(el -> System.out.println(el));
////		deleteElementByisbn(listaBiblio,"rft4534");
////		System.out.println("*******lista eliminazione**********");
////		listaBiblio.forEach(el -> System.out.println(el));
////		serchByIsbn("gtrt453");
//		searchByDate(LocalDate.of(1999,9,23)).forEach(ele->System.out.println(ele));
//		searchByAutore("pippo").forEach(ser->System.out.println(ser));;
//		scriviBackUp(a);
//		scriviBackUp(b);
//		scriviBackUp(c);
//		scriviBackUp(d);
//		scriviBackUpTotale(listaBiblio);
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
		System.out.println("Insericsci Mese Data Pubblicazione");
		int mese = Integer.parseInt(r.nextLine());
		System.out.println("Insericsci Giorno Data Pubblicazione");
		int day = Integer.parseInt(r.nextLine());
		System.out.println("Insericsci Numero Pargine");
		int pag = Integer.parseInt(r.nextLine());

		if (risp == 1) {
			System.out.println("Insericsci Autore");
			String autore = r.nextLine();
			System.out.println("Insericsci Genere");
			String gender = r.nextLine();
			element = new Book(isbn, title, LocalDate.of(anno, mese, day), pag, autore, gender);
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
			element = new Rivista(isbn, title, LocalDate.of(anno, mese, day), pag, per);
			scriviBackUp(element);
		}

		
		return element;
	}

	public static void deleteElementByisbn() {
		listaBiblio.forEach(s->System.out.println(s));
		System.out.println("Inserisci il codice ISBN del libro da eliminare");
		
		try (Scanner r = new Scanner(System.in)) {
			String isbn = r.nextLine();
			Optional<ElementoBiblio> e = listaBiblio.stream().filter(el -> el.getISBN().equals(isbn)).findFirst();
			if (e.isPresent()) {
				ElementoBiblio index = e.get();
				listaBiblio.remove(index);
				System.out.println("Eliminato con successo");
				listaBiblio.forEach(s->System.out.println(s));
				
			}else {
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
		List<ElementoBiblio> searchDate = listaBiblio.stream().filter(e -> e.getAnnoPublicazione().getYear() == year)
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

	public static void scriviBackUpTotale(List<ElementoBiblio> ele) throws IOException {

		FileUtils.writeStringToFile(file2, ele.toString(), "UTF-8");

	}

	public static List<ElementoBiblio> readFromFile() {
		return null;
	}

}
