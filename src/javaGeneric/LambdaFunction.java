package javaGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaFunction {

	public static void main(String[] args) {
		

		Function< List<Product>, List<Product> > funcionProduct = lp -> {
			
			List<Product> lp1 = new ArrayList<>();
			
			lp.forEach( p -> lp1.add(new Product(p.getName().toUpperCase(), p.getPrice())) );
			
			return lp1;
		};
		
		List <Product> lp = new ArrayList<>();
		lp.add(new Product("Tv", 1750.0));
		lp.add(new Product("IPhone xi", 8500.0));
		lp.add(new Product("Microwave", 1200.0));
		lp.add(new Product("Barbie Doll", 12.0));
		
		
		List <Product> lp1 = funcionProduct.apply(lp);
		System.out.println(lp);
		System.out.println(lp1);
		
		List <Product> lp2 = lp.stream().
							 map(p -> new Product(p.getName().toUpperCase(),p.getPrice())).
							 collect(Collectors.toList());
		System.out.println(lp);
		System.out.println(lp2);
		
	}
}
