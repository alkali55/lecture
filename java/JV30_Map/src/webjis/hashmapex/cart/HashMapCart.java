package webjis.hashmapex.cart;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCart {
	private HashMap<Product, Integer> cart = new HashMap<Product, Integer>();
	
	public static void main(String[] args) {
		
		HashMapCart hc = new HashMapCart();
		Product p1 = new Product("자바1", 10000);
		Product p2 = new Product("자바1", 10000);
		Product p3 = new Product("오라클1", 20000);
		
		hc.addProd(p1);
		hc.addProd(p2);
		hc.addProd(p3);
		System.out.println(hc.cart);
		hc.showAllProd();
		hc.showTotalPrice();
		
		hc.removeProd(p2);
		hc.removeProd(p1);
		System.out.println(hc.cart);

	}
	
	public void addProd(Product p) {
		if(!cart.containsKey(p)) {
			cart.put(p, 1);
		} else {
			int tmp = cart.get(p) + 1;
			cart.replace(p, tmp);
		}
		
	}
	
	public void removeProd(Product p) {
		if(cart.containsKey(p)) {
			if(cart.get(p) == 1) {
				cart.remove(p);			
			} else {
				int tmp = cart.get(p) - 1;
				cart.replace(p, tmp);
			}
		}
	}
	
	public int showTotalPrice() {
		Set<Entry <Product, Integer>> s1 = cart.entrySet();
		Iterator it1 = s1.iterator();
		int totalPrice = 0;
		
		while(it1.hasNext()) {
			Entry<Product, Integer> et = (Entry<Product, Integer>)it1.next();
			totalPrice += et.getKey().getPrice() * et.getValue();
		}
		
		System.out.println("총 가격 : " + totalPrice);
		return totalPrice;
		
	}
	
	public void showAllProd() {
		Set<Product> tmpSet = cart.keySet();
		for(Product prod : tmpSet) {
			System.out.println(prod);
		}
	}
}
