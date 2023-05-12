package rubricaTel;

import static esercizioCollection.MainCollection.input;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.Set;
public class MainRubrica {
	private static Logger log = LoggerFactory.getLogger(MainRubrica.class);
 public	static Map<String, String> m = new HashMap<String,String>();
	public static void main(String[] args) {
		System.out.println("Quanti contatti vuoi aggiungere?");
		int numCont= Integer.parseInt(input.nextLine());
		for(int i =0;i<numCont;i++) {
			addContact();
		}
		
			System.out.println(m.toString());
		//findContByName();
		findContByNum();
		
	}
	public static void addContact() {
		System.out.println("Inserisci il nome");
		String nome = input.nextLine();
		System.out.println("inserisci il numero");
		String num = input.nextLine();
		m.put(nome,num);
		
	}
	public static void removeContact(){
		System.out.println("Inserisci il nome");
		String nome = input.nextLine();
		System.out.println("inserisci il numero");
		String num = input.nextLine();
		m.remove(nome, num);
	}
	public static void findContByName() {
		System.out.println("Inserisci il nome");
		String name = input.nextLine();
		System.out.print(m.get(name));
	}
	
	public static Set<String> findContByNum() {
		Set<String> value = new HashSet<>();
		System.out.println("Inserisci il numero");
		String num = input.nextLine();
		if(m.containsValue(num)) {
			for(Map.Entry<String, String> entry : m.entrySet()) {
			if(Objects.equals(entry.getValue(), num)) {
				value.add(entry.getKey());
			}
		}
		System.out.println(value.toString() + num);
		}
		return value;
		
		
	}
}
