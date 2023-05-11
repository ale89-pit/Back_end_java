package Player;

import java.util.Scanner;

public class MainPlayer {
	public static ElMult[] arr = new ElMult[5];
	static int elementiCreati = ElMult.elementiCreati;
 public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("E' il momento di cominciare");
		
			createdElement();
			showElement(arr);
			System.out.println("adesso puoi ascoltare o guardare i tuoi file");
			System.out.println("Seleziona un file con i tasti da 1 a 5");
			int selected = input.nextInt();
		for(int i =0;i<arr.length;i++) {
			if (arr[selected -1]instanceof Img) {
				Img img = (Img) arr[selected -1];
				int sel;
				do {
					System.out.println("Seleziona 1->upLum,2->downLum,3->show");
					sel = input.nextInt();
					switch(sel) {
					case 1: img.setUpLum();
					case 2: img.setDownLum();
					case 3: img.show();
					}
				}while(sel !=0);
			}else if(arr[selected -1]instanceof Audio) {
				Audio aud = (Audio) arr[selected -1];
				 int sel;
				do {
					System.out.println("Seleziona 1->upVol,2->downVol,3->play");
					sel = input.nextInt();
					switch(sel) {
					case 1: aud.setUpVol();
					case 2: aud.setDownVol();;
					case 3: aud.play();
					}
				}while(sel !=0);
		}else {
			Video vid = (Video) arr[selected -1];
			 int sel;
			do {
				System.out.println("Seleziona 1->upVol,2->downVol,3->play,4->UpLum,5->downLum");
				sel = input.nextInt();
				switch(sel) {
				case 1: vid.setUpVol();
				case 2: vid.setDownVol();;
				case 3: vid.play();
				case 4: vid.setUpLum();
				case 5: vid.setDownLum();
				}
			}while(selected !=0);
		}
		}
	}
	
	public static void createdElement() {
		
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Crea un nuovo Elemento.1->IMG,2->VIDEO, 3->AUDIO");
			boolean next= false;
				int risp = input.nextInt();
		do {
			switch(risp) {
			case 1: 
				System.out.println("Insericsci un nome del file img");
				String name = input.next();
				arr[i]= new Img(name,randomNum());
				System.out.println(arr[i]);
				next = true;
				
				break;
				
			case 2:
			System.out.println("Insericsci in nome del file video");
			String vidName = input.next();
			arr[i]= new Video(vidName,randomNum(),randomNum());
			System.out.println(arr[i]);
			next = true;
			
			break;
			case 3:
				System.out.println("Insericsci in nome del file audio");
				String audName = input.next();
				arr[i]= new Audio(audName,randomNum());
				System.out.println(arr[i]);
				next = true;
			}
		}while(!next);
		
		
		}
		
	}
	public static void showElement(ElMult[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	/*Random Number generato per i valori di luminosità e volume*/ 
	public static int randomNum() {
	      int min = 1; // Minimum value of range
	      int max = 5; // Maximum value of range
	      // Print the min and max  
	      
	      // Generate random int value from min to max
	      int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
	      // Printing the generated random numbers
	      return random_int;
	    }
}
