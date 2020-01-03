package javaGeneric;

import java.util.Objects;

public class Product implements Comparable <Product> {
	
	private String name;
	private Double price;
	
	public Product() {
		
	}
	
	/***
	 * Product constructor.
	 * 
	 * @param name A string representing the product name.
	 * 
	 * @param price The product price as Double object.
	 * 
	 * */
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	/***
	 * Product constructor.
	 * 
	 * @param stringCSV A string representing the a product entry read from a CSV file.
	 * The file structure is "product name, price".
	 * 
	 * */
	public Product(String stringCSV) {
		
		if (stringCSV != null) {
			String fields[] = stringCSV.trim().split(",");
			if (fields.length >= 2) {
				this.name = fields[0];
				this.price = Double.parseDouble(fields[1]);
			}
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", price); 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	
	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.price);
	}

}
