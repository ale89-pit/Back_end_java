package Ecommerce;

public class Article {
 public String id;
 public String descrp;
 public double price;
 public int rim;
 
 public Article(String id,String descrp,double price,int rim) {
	 this.id = id;
	 this.descrp = descrp;
	 this.price = price;
	 this.rim = rim;
 }
 
 public void showArt() {
	 System.out.println("ID :" +this.id + " Descrp:" + this.descrp + " Price :" + this.price + " Rim :" + this.rim );
 }
}
