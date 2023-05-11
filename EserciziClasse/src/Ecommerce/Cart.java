package Ecommerce;

public class Cart {
	public Article[] prod;
	public Customer clienteAssociato;
	public double totalPrice;
	
	
	public Cart(Article[]prod,Customer clienteAssociato,double total) {
		this.prod = new Article[10];
		this.clienteAssociato = clienteAssociato;
		this.totalPrice = total;
	
	}
	
	public void StampaCarrello() {
		System.out.println("-------------");
		System.out.println(this.clienteAssociato.name + " " + this.clienteAssociato.surname);
		for (int i =0;i< prod.length;i++) {
			if (prod[i] != null) {
				System.out.println(prod[i].descrp + prod[i].price);
			}
		}
	}
}
