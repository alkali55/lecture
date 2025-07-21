package webjis;

public class ProductMain {

	public static void main(String[] args) {
		Computer com = new Computer(300000, "a123a");
		Tv tv = new Tv(200000, "b112s");
		Monitor mon = new Monitor(100000, "qq122");
		Customer cus1 = new Customer("홍길동", 1000000);
		
		cus1.showAll();
		cus1.buy(com);
		cus1.buy(tv);
		cus1.buy(mon);
		cus1.showAll();
		

	}

}
