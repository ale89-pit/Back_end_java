package w2D5_Project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {
	static Logger log = LoggerFactory.getLogger(MainProject.class);
	public static void main(String[] args) {
		log.info("test");
		System.out.println(addELement());
	}
public static ElementoBiblio addELement(){
	ElementoBiblio element = new Book("1234fesa4","titolo", LocalDate.of(1920, 10, 02),150,"pippo","fantasy");
//	element.add();
//	element.add(new Rivista("dffs332","titolo2", LocalDate.of(2020, 05, 30),50,Periodicita.MENSILE));
//	element.add(new Book("495oeof","titolo3", LocalDate.of(1967, 8, 02),100,"PLUTO","Horror"));
//	element.add(new Rivista("rtujh432","titolo4", LocalDate.of(2023, 01, 01),80,Periodicita.SEMESTRALE));
//	element.add(new Book("543fgws3","titolo5", LocalDate.of(1989, 04, 25),400,"Paperino","Commedy"));
	return element;
	
}

public List<ElementoBiblio> searchByISBN(List<ElementoBiblio> list,String isbn){
	return list.filter(e->e.getISBN().equals(isbn))
	 
}
}
