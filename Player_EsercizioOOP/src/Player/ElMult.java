package Player;

import java.util.Scanner;


public abstract class ElMult{
	public static int elementiCreati = 0;
	public static Scanner input = new Scanner(System.in);
	protected String title;

	public ElMult(String title) {
		
		this.title = title;
		elementiCreati++;
	}
	
	

	@Override
	public String toString() {
		return "ElMult [title=" + title + "]";
	}
	
}
