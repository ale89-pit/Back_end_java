package esercizio3;


import java.io.File;
import java.util.HashMap;

import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Presenza {
	
	private static Logger log = LoggerFactory.getLogger(Presenza.class);
	private String nome;
	private int giorniPresenza;
	
	
	public Presenza(String nome, int giorniPresenza) {
		super();
		this.nome = nome;
		this.giorniPresenza = giorniPresenza;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getGiorniPresenza() {
		return giorniPresenza;
	}
	public void setGiorniPresenza(int giorniPresenza) {
		this.giorniPresenza = giorniPresenza;
	}
	@Override
	public String toString() {
		return " " +nome +"@"+ giorniPresenza;
	}
	
	/*public static void RegistroPresenze(){
		list.
		FileUtils.writeStringToFile(file, s,"UTF-8",true);
	
	}*/
}
