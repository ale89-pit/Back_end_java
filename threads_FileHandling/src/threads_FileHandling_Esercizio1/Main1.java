package threads_FileHandling_Esercizio1;

public class Main1 {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1("*");
		Thread1 t2 = new Thread1("#");
		
		t1.start();
		t1.sleep(500);
		t2.start();
		t2.sleep(1000);
	}

}
