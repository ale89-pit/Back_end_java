package MainCollecRandomNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static esercizioCollection.MainCollection.input;

public class MainCollecRandomNum {
	private static List<Integer> l = new ArrayList<Integer>();
	private static Logger log = LoggerFactory.getLogger(MainCollecRandomNum.class);

	public static void main(String[] args) {

		boolean continua = false;

		try {

			do {
				System.out.println("inserisci un numero da 1 a 10 per generare la sequenza");
				int num = input.nextInt();

				if (input.hasNextInt()) {
					System.out.println("Errore inserito errato");
					continua = true;
				} else if (num == 0) {
					continua = false;
				} else {

					numList(input.nextInt());

					System.out.print("Elementi della lista :");
					l.forEach(e -> System.out.print(" " + e + " "));

					numListInvert(l);
					stampaPariDisp(l, false);

				}
			} while (continua);

		} catch (NumberFormatException e) {
			log.error("Non hai inserito un valore valido!!!");

		} catch (InputMismatchException e) {
			log.error("Non hai inserito un valore valido!!!");

		}
	}

	public static void numList(int a) {
		Random random = new Random();

		for (int i = 0; i < a; i++) {
			l.add(random.nextInt(0, 101));
		}
	}

	public static void numListInvert(List<Integer> list) {
		List<Integer> listInvert = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			int valore = list.get(i);
			// log.info(" " + i );
			listInvert.add(i, valore);

		}

		Collections.reverse(listInvert);
		System.out.print("Elementi nella listaInvertita :");
		listInvert.forEach(e -> System.out.print(" " + e + " "));
		listInvert.forEach(e -> l.add(e));
	}

	public static void stampaPariDisp(List<Integer> lst, boolean b) {
		if (b) {
			for (int i = 0; i < lst.size(); i++) {
				if (i % 2 == 0) {
					System.out.print(" " + lst.get(i));
				}
			}
		} else {
			for (int j = 0; j < lst.size(); j++) {
				if (j % 2 != 0) {
					System.out.print(" " + lst.get(j));
				}
			}
		}

	}
}
