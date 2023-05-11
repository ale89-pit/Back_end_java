package Ecommerce;

import java.time.LocalDate;

public class Customer {
 public String id;
 public String name;
 public String surname;
 public String email;
 public LocalDate dataIscr;
 
 public Customer(String id,String name,String surname,String email) {
	 this.id = id;
	 this.name = name;
	 this.surname = surname;
	 this.email = email;
	 this.dataIscr =  LocalDate.now();
 }
 
 public void showCust() {
	 System.out.println("ID :" + this.id + " Name :" + this.name + " Surname :" + this.surname + " Email :" + this.email + " Date iscr :" + this.dataIscr);
 }
}
