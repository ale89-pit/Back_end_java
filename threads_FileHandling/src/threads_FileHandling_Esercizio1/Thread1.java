package threads_FileHandling_Esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thread1 extends Thread{
	private String simbolo;
	public Thread1(String simbolo) {
		super();
		this.simbolo = simbolo;
	}
	private Logger log = LoggerFactory.getLogger(Thread1.class);
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			try {
				Thread1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Sono il tred con :" + simbolo);
			log.info("THREAD" + simbolo);
		}
	}
	
}
