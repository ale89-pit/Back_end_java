package mavenLambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	private static LocalDate today = LocalDate.now();
	public static List<Product> allProduct;
	static List<Product> list1 = new ArrayList<Product>();
	static List<Product> list2 = new ArrayList<Product>();
	static List<Product> list3 = new ArrayList<Product>();
	static List<Product> list4 = new ArrayList<Product>();
	static List<Product> list5 = new ArrayList<Product>();
	static List<Order> orderList = new ArrayList<Order>();

	public static void main(String[] args) {
		Product p1 = new Product("libro", "book", 200);
		Product p2 = new Product("telefono", "baby", 20);
		Product p3 = new Product("coltello", "boys", 101);
		Product p4 = new Product("violino", "baby", 150);
		Product p5 = new Product("gioco", "baby", 100);
		Product p6 = new Product("girello", "boys", 200);
		Product p7 = new Product("bbooo", "book", 4);
		Product p8 = new Product("dakldsakjlsd", "boys", 200);
		Product p9 = new Product("ierwmkc", "book", 90);
		Customer c1 = new Customer("Aldo", 2);
		Customer c2 = new Customer("Maria", 2);
		Customer c3 = new Customer("Giovanni", 1);
		allProduct = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		list1.add(p4);
		list2.add(p5);
		list2.add(p6);
		list3.add(p7);
		list3.add(p8);
		list4.add(p1);
		list4.add(p4);
		list4.add(p8);
		list5.add(p3);
		list5.add(p6);
		list5.add(p7);
		Order o1 = new Order("active", list1, c1);
		Order o2 = new Order("active", list2, c2);
		Order o3 = new Order("active", list3, c3);

		orderList.add(o1);
		orderList.add(o2);
		orderList.add(o3);

		filtraLista().forEach(e -> System.out.println(e));
		System.out.println(o1);

		filtraListaBaby("baby").forEach(e -> System.out.println(e));
		;
		getDiscount("boys",0.9).forEach(e->System.out.println(e));
	}

	public static List<Product> filtraLista() {
		return allProduct.stream().filter(e -> (e.getCategory().equals("book") && e.getPrice() > 10))
				.collect(Collectors.toList());

	}

	public static List<Order> filtraListaBaby(String cat) {

		return orderList.stream()
				.filter(o -> o.getProducts().stream().anyMatch(e -> e.getCategory().equalsIgnoreCase(cat)))
				.collect(Collectors.toList());

	}

	public static List<Product> getDiscount(String cat, Double disc) {
		return allProduct.stream().filter(e -> e.getCategory().equals(cat)).map(p -> {
			Product pr = p;
			pr.setPrice(p.getPrice() * disc);
			return pr;
		}).collect(Collectors.toList());
	}

}
