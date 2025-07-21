package webjis.hashmapex.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ThcCart {
	
	private Map<Product, Integer> cartMap = new HashMap<Product, Integer>();
	
	public void addProduct(Product product, int qty) {
		// 상품 추가
		int cartQty = cartMap.getOrDefault(product, 0);
		cartMap.put(product, cartQty + qty);
	}
	
	public void deleteProduct(Product product, int qty) {
		// 상품 삭제
		int cartQty = cartMap.getOrDefault(product, 0);
		int updatedQty = cartQty - qty;
		
		if(updatedQty <= 0) {
			cartMap.remove(product);
		} else {
			cartMap.put(product, updatedQty);			
		}
		
		
	}
	
	public void displayCart() {
		// 상품 출력
		if(cartMap.size() == 0) {
			System.out.println("장바구니가 비었습니다.");
		} else {
			for (Entry entry : cartMap.entrySet()) {
				System.out.println("책 : " + entry.getKey() + ", 수량 : " + entry.getValue());
			}
		}
		
	}
}
