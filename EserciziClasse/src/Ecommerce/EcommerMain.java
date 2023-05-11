package Ecommerce;

import java.time.LocalDate;

public class EcommerMain {

	public static void main(String[] args) {
		
		Article art1 = new Article("1234","iciaoaiciaioa",234,12);
		Article art2 = new Article("567","wrwerwerr",24,1200);
		Article art3 = new Article("0987","vvcbbvncv",567,2);
		 art3.showArt();
		 art2.showArt();
		 art1.showArt();
		 
		 Customer cust1 = new Customer("123","Super","Mario","ajsjs@cfddf.com");
		 Customer cust2 = new Customer("456","Gep","Etto","ajsjs@cfddf.com");
		 cust1.showCust();
		 cust2.showCust();
	}

}
