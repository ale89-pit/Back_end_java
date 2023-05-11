
public class Rettangolo {

	public static void main(String[] args) {
		Rettangolo_In first = new Rettangolo_In(33.4,44);
		first.areaEPerRett();
		Rettangolo_In second = new Rettangolo_In(15,51);
		second.areaEPerRett();
		due(first,second);
	}
	public static void due(Rettangolo_In first, Rettangolo_In second) {
		double sommaArea = (first.latoA*first.latoB)+(second.latoA*second.latoB);
		System.out.print("la somma dell'area è :"+ sommaArea);
		double sommaPer = (((first.latoA+first.latoB)*2)+((second.latoA+second.latoB)*2));
		System.out.print("la somma del perimetro è :" + sommaPer);
	}
	
} 
