package esercizio3;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Main3 {
	private Logger log = LoggerFactory.getLogger(Main3.class);
	public	static List<Presenza> listaPresenza = new ArrayList<Presenza>();
	private static String path ="dati/presenze.txt";
	static File file = new File(path);
	
	
	public static void main(String[] args){
		creaPresenza();
		
		listaPresenza.forEach(p -> System.out.print(p));
		
		try {
			salvaPresenzaFile();
			leggiPresenzeDaFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	public static void creaPresenza() {
		 listaPresenza.add(new Presenza("mario",5));
		 listaPresenza.add(new Presenza("giuseppe",2));
		 listaPresenza.add(new Presenza("francesco",12));
	}
	
	public static void salvaPresenzaFile() throws IOException {
		String presenzeTxt = "Test Salvataggio";
		for (Presenza presenza : listaPresenza) {
			if(presenzeTxt.length() !=0) {
				presenzeTxt += "#";
			}
			presenzeTxt += presenza;
		}
		FileUtils.writeStringToFile(file, presenzeTxt, "UTF-8");
	}
	public static void leggiPresenzeDaFile() throws IOException {
		String presenzeTxt = FileUtils.readFileToString(file,"UTF-8");
		String[] arr = presenzeTxt.split("#");
		System.out.println(presenzeTxt);
		for (String p : arr) {
			System.out.println(p);
		}
	}
}
