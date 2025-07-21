package webjis.hashmapex.cart;

import java.util.Objects;

public class Product {
	private String name;
	private int price;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Product) {
			Product tmp = (Product) obj;
			if(name.equals(tmp.name)&& price == tmp.price) {
				result = true;
			}
			
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + price + "]";
	}
	
	
}
