package OperTel;

public class Sim {
	public  String personalNum;
	public  double credit;
	public Call[] chiamate;
 
	
	
	public Sim(String num,double cred,Call[] arr) {
		this.personalNum = num;
		this.credit = cred;
		this.chiamate = arr;
		
		
	}
	public void info() {
		System.out.println("Num" + this.personalNum);
		System.out.println("credito" + this.credit);
		for(int i = this.chiamate.length -1;i>this.chiamate.length -6 ;i--) {
			System.out.println("numero :" +this.chiamate[i].callGet + "durata " + this.chiamate[i].time);
		}
	}
	
}
