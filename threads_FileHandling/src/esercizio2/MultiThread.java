package esercizio2;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MultiThread extends Thread implements Runnable {
	private Logger log = LoggerFactory.getLogger(MultiThread.class);
	int num1;
	int num2;
	int[] array;
	
	int result = 0;
	public MultiThread(int[] array, int num1, int num2) {
		this.array= array;
		this.num1 = num1;
		this.num2 = num2;
		
	}
	@Override
	public void run() {
		
		for(int i =this.num1;i<=this.num2;i++) {
		 result +=array[i];
		 //log.info(" " + array[i] );
		
		}
		System.out.println("il totale è :" + result);
		log.info(" " + result);
		Main2.listaRisultati.add(result);
		
		}
	
}
