package webjis;

public class OrderMain {

	public static void main(String[] args) {
		int total = 0; // 지역변수
	
		Order order1 = new Order();
		order1.prodName = "오라클";
		order1.price = 20000;
		order1.quantity = 2;
		
		Order order2 = new Order();
		order2.prodName = "자바";
		order2.price = 10000;
		order2.quantity = 3;
		
		Order order3 = new Order();
		order3.prodName = "스프링";
		order3.price = 25000;
		order3.quantity = 4;
		

//		System.out.println("상품명 : " + order1.prodName + " 가격 : " + order1.price + "원 수량 : " + order1.quantity);
//		System.out.println("상품명 : " + order2.prodName + " 가격 : " + order2.price + "원 수량 : " + order2.quantity);
//		System.out.println("상품명 : " + order3.prodName + " 가격 : " + order3.price + "원 수량 : " + order3.quantity);
		
		
		
		Order[] orders = new Order[3];
		
		orders[0] = order1;
		orders[1] = order2;
		orders[2] = order3;
		
//		for (int i = 0; i < orders.length; i++) {
//			orders[i] = new Order();
//		}
//		
//		orders[0].prodName = "오라클";
//		orders[0].price = 20000;
//		orders[0].quantity = 2;
//		
//		orders[1].prodName = "자바";
//		orders[1].price = 10000;
//		orders[1].quantity = 3;
//		
//		orders[2].prodName = "스프링";
//		orders[2].price = 25000;
//		orders[2].quantity = 4;
		
		for (int i = 0; i < orders.length; i++) {
			System.out.println("상품명 : " + orders[i].prodName + ", 가격 : " + orders[i].price + "원, 수량 : " + orders[i].quantity);
		};
		
		for (Order odd: orders) {
			total += odd.price * odd.quantity;
		};
		System.out.println("총 결제 금액 : " + total + "원");
		

	}

}
