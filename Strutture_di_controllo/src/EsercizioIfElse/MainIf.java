package EsercizioIfElse;

public class MainIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countChar("bla"));
		System.out.println(checkLeapYear(2023));
	}
	//Esercizio 1 If else Pari e Dispari
	
	
	public String str;
	
	public static boolean countChar(String str) {
		 boolean c = false;
		if ((str.length()%2)==0){
			c = true;
		}
		return c;
	}
	
	//Esercizio 2 anno bisestile
	
	
	public static boolean checkLeapYear(int a) {
		
		if (a%4 ==0 || (a%100 ==0 && a%400 ==0)) {
			return  true;
		}
		return false;
	}

}
