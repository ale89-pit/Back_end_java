package esercizioCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainCollection {
	public static Scanner input = new Scanner(System.in);
	public static Logger log = LoggerFactory.getLogger(MainCollection.class);
	int n;
	private static Set<String> s = new HashSet<String>();

	public static void main(String[] args) {
		System.out.println("inserisci il numero di parole da inserie");
		int num = Integer.parseInt(input.nextLine());
		getWord(num);
		s.forEach(e -> log.info(e));
		int size = s.size();
		System.out.println("Numero elementi:" + size);
	}

	public static void getWord(int a) {
		for (int i = 0; i < a; i++) {
			System.out.println("inserisci la parola");
			String str = input.nextLine();
			boolean risp = s.add(str);
			if(!risp) {
				System.out.println("Parola duplicata " + str);
			}
			
		}
	}
}
