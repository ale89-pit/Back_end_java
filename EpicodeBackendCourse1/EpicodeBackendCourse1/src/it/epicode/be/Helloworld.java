package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		int r = moltiplica(2,7);
		System.out.println(r);
		String d = concatena("ciao ",54);
		System.out.println(d);
		String array[]= {"Ciao","a","tutti","sono","alessio"};
		System.out.println("");
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		for (int i=0;i<6;i++) {
			System.out.println(insertInArr(array,"bel")[i]);
		}
		//inverti();
		//System.out.println(perimetroRett());
		//System.out.println(pariODisp());
		System.out.println(areaDelTriangolo());
		}

public static int moltiplica(int a,int b) {
	return a*b;
}
public static String concatena(String a,int b) {
	return  a+b;
}
public static String[] insertInArr(String arr[],String f) {
	String array []= new String[6];
	array[0]=arr[0];
	array[1]=arr[1];
	array[2]=f;
	array[3]=arr[2];
	array[4]=arr[3];
	array[5]=arr[4];
	return array;
		
}
public static void inverti() {
	Scanner sc = new Scanner(System.in);
	String array[] = new String[3];
	System.out.println("inserisci la prima stringa");
	array[0]= sc.nextLine();
	System.out.println("inserisci la seconda stringa");
	array[1]= sc.nextLine();
	System.out.println("inserisci la terza stringa");
	array[2]= sc.nextLine();
	for (int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	for (int i=2;i>=0;i--) {
		System.out.println(array[i]);
	}
}

public static double perimetroRett() {
	Scanner sc = new Scanner(System.in);
	System.out.println("inserisci lato 1");
	double l1 = sc.nextDouble();
	System.out.println("inserisci lato 2");
	double l2 = sc.nextDouble();
	return l1*l2;
	
}
public static int pariODisp() {
	Scanner sc = new Scanner(System.in);
	System.out.println("inserisci un numero intero");
	int n = sc.nextInt();
	int res;
	if (n%2==0) {
		res = 0;
	}else {
		res = 1;
	}
	return res;
	}

public static double areaDelTriangolo() {
	Scanner sc = new Scanner(System.in);
	System.out.println("inserisci 1° lato");
	double a = sc.nextDouble();
	System.out.println("inserisci 2° lato");
	double b = sc.nextDouble();
	System.out.println("inserisci 2° lato");
	double c = sc.nextDouble();
	double p = (a+b+c)/2;
	double area = (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	return area;
}

}



