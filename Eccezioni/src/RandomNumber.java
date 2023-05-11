import java.util.Scanner;


public class RandomNumber {
	
	
	public static int[] randomArr = new int[5];
	public static int index;
	public static int num;
	public static Scanner input = new Scanner(System.in);
	public static boolean continua;
	
	
	public static void main(String[] args) {
		System.out.println("Creazione Array di 5 elementi");
		
			for(int i=0;i<5;i++) {
				
				randomArr[i]= getRandomNum();
			}
			stampArr(randomArr);
			
				do {
				try {
				System.out.println("Inserisci il vaolre da 1 a 10 oppure 0 per uscire");
				num = Integer.parseInt(input.nextLine());
				if(num !=0 ) {
					System.out.println("Inserisci la posizione che vuoi sostituire ");
					index = Integer.parseInt(input.nextLine());
					randomArr[index] = num;
					stampArr(randomArr);
				}else {
					continua=false;
				}
				
			
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("index nn presente");
			}catch(NumberFormatException e ) {
				System.out.println("Inserisci un numero");
			}
			}while(continua);
			
			
	}

	public static int getRandomNum() {
		
		      int min = 1; // Minimum value of range
		      int max = 10; // Maximum value of range
		      // Print the min and max  
		      
		      // Generate random int value from min to max
		      int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
		      // Printing the generated random numbers
		      return random_int;
		    }
	
	
	public static void stampArr(int[] arr) {
		for(int i=0;i<randomArr.length;i++) {
			System.out.println(" "+ i + " "+ randomArr[i]);
			
		}
	}
		
}
