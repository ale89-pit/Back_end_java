package MainFor;

import java.util.Scanner;

public class MainFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDown();
	}
	
	public static void countDown() {
		System.out.println("Inserisci un numero");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for (int i= n; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
}
