
public class Rettangolo_In {
	public double latoA;
	public double latoB;
	public double p;
	public double a;
	
	
	public Rettangolo_In(double latoa,double latob) {
		this.latoA = latoa;
		this.latoB = latob;
		;
	}
	
	public void areaEPerRett() {
		System.out.println("area del Rettangolo;"+ (this.latoA*this.latoB));  
		System.out.println("Perimetro del Rettangolo;"+ ((this.latoA+this.latoB)*2));
		
		}
	
	}
	
