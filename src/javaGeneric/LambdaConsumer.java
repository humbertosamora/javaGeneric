package javaGeneric;

import java.util.ArrayList;
import java.util.List;

public class LambdaConsumer {
	
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("TV", 1750.0));
		products.add(new Product("Notebook", 3299.0));
		products.add(new Product("Xiaomi 8", 850.0));
		products.add(new Product("Bluetooth speaker", 790.0));
		
		products.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		products.forEach(System.out::println);
		
	}
}
