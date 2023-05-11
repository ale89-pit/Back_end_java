package mavenLambda;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Order {
		private static long id = 0;
		private String status;
		private LocalDate orderDate;
		private LocalDate localDate;
		private List<Product> products;
		private Customer customer;
		public Order(String status,  List<Product> products,Customer customer) {
			
			id++;
			this.status = status;
			this.localDate = LocalDate.now();
			this.orderDate = this.localDate.plusDays(3);
			this.products = products;
			this.customer = customer;
		}
		public long getId() {
			return id;
		}
		
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public LocalDate getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(LocalDate orderData) {
			this.orderDate = orderData;
		}
		public LocalDate getLocalDate() {
			return localDate;
		}
		public void setLocalDate(LocalDate localDate) {
			this.localDate = localDate;
		}
		public List<Product> getProducts() {
			return products;
		}
		public void setProducts(List<Product> products) {
			this.products = products;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		@Override
		public String toString() {
			return "Order [status=" + status + ", orderData=" + orderDate + ", localDate=" + localDate + ", products="
					+ products + ", customer=" + customer + "]";
		}

		
}
