package webthc;

public class BuyMain {

	public static void main(String[] args) {
		
		Customer1 customer1 = new Customer1();
		
		Tv1 tv = new Tv1();
		System.out.println(tv);
		
		Monitor1 monitor1 = new Monitor1();
		System.out.println(monitor1);
		
		Computer1 computer1 = new Computer1();
		System.out.println(computer1);
		
		customer1.buy(tv);
		customer1.buy(monitor1);
		customer1.buy(computer1);
		
		customer1.printItems();
		

	}

}
