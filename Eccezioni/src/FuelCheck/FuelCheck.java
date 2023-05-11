package FuelCheck;
import java.util.Scanner;
public class FuelCheck {
	public static double km;
	public static double l;
	public static Scanner input = new Scanner(System.in);
	public static boolean continua;
	public static void main(String[] args) {
		do {
			try {
			System.out.println("insrisci i km percorsi");
			km = Integer.parseInt(input.nextLine());
			System.out.println("insrisci i l consumati");
			l = Integer.parseInt(input.nextLine());
		
			
			System.out.println(check(km,l));
		}catch(NumberFormatException e){
			System.out.println("valore inserito non numerico");
		}
		}while(!continua);
		
		
		
	}

	public static double check(double km,double l) {
		if (l==0) {
			System.out.println("Errore di divisione per 0");
			return 0;
		}else {
			double consumo = (km/l);
			continua= true;
			return consumo;
			
		}

		
		
	}
}
