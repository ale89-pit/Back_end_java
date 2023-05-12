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
public static List<ElementoBiblio> addELement(){
	List<ElementoBiblio> element = new ArrayList<ElementoBiblio>();
	element.add(new Book("1234fesa4","titolo", LocalDate.of(1920, 10, 02),150,"pippo","fantasy"));
	element.add(new Book("1234fesa4","titolo", LocalDate.of(1920, 10, 02),150,"pippo","fantasy"));
	element.add(new Book("1234fesa4","titolo", LocalDate.of(1920, 10, 02),150,"pippo","fantasy"));
	element.add(new Book("1234fesa4","titolo", LocalDate.of(1920, 10, 02),150,"pippo","fantasy"));
	element.add(new Book("1234fesa4","titolo", LocalDate.of(1920, 10, 02),150,"pippo","fantasy"));
	return element;
	
}
}
