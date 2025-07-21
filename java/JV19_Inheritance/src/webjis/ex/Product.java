package webjis.ex;

public class Product {
	
	private String name;
	private int price;
	
	Product(String name, int price){
//		super();
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String display() {
		return "Product [이름=" + name + ", 가격=" + price + "]";
	}
	
	@Override
	public String toString() {
		return "Product [이름=" + name + ", 가격=" + price + "]";
	}
	
//	void displayProduct() {
//		System.out.println("이름 : " + name + ", 가격 : " + price + "원");
//	}
}
