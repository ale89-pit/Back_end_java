package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main2 {
	private Logger log = LoggerFactory.getLogger(Main2.class);
	static List<Integer> listaRisultati = new ArrayList<Integer>();;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		int[] array = new int[3000];
		
		for(int i=0;i<array.length;i++) {
			Random num = new Random();
			
			array[i]=num.nextInt(3000);
			//System.out.println(" "+ array[i]);
		}
		
		MultiThread multi1 = new MultiThread(array,0,1000);
		MultiThread multi2 = new MultiThread(array,1001,2000);
		MultiThread multi3 = new MultiThread(array,2001,2999);
		
		
		multi1.start();
		multi1.join();
		multi2.start();
		multi2.join();
		multi3.start();
		multi3.join();
		
	}

}
