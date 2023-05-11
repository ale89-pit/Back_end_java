package OperTel;

public class SimMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Call prim = new Call("1235347",80);
		Call secon = new Call("1235347",80);
		Call ter = new Call("1978633",10);
		Call quar = new Call("94682137",380);
		Call quin = new Call("28935826",60);
		Call[] array = {prim,secon,ter,quar,quin};
		Sim alesim = new Sim("454336",100,array);
		System.out.println("numero personale "+ alesim.personalNum + "credito residuo "+ alesim.credit);
		alesim.info();
	}

}
