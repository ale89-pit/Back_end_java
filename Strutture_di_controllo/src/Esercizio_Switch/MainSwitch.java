package Esercizio_Switch;

import java.util.Scanner;

public class MainSwitch {

	public static void main(String[] args) {
		//getWord();
		getString();

	}
	public static void getWord() {
		System.out.println("inserisci un numero intero");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 0:  System.out.println("zero");break; 
		case 1: System.out.println("uno");break; 
		case 2: System.out.println("due");break; 
		case 3: System.out.println("tre");break;
		default:System.out.println("Valore Errato");break;
		}
		
		
	}
	public static String  q= "q";
	public static void getString() {
		String str ;
		do {
			
			System.out.println("inserisci una stringa");
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();
			
			for (int i =0;i < str.length();i++) {
				System.out.println(str.charAt(i)+ " ");
			}
			
		}while(!str.equalsIgnoreCase(q));
	}
	

}
