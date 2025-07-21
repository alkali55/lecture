package webjis;

public class Product {
	private int price;
	private String modelNum;
	
	Product(int price, String modelNum){
		this.price = price;
		this.modelNum = modelNum;
	}
	

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getModelNum() {
		return modelNum;
	}


	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}


	@Override
	public String toString() {
		return "Product [price=" + price + ", modelNum=" + modelNum + "]";
	}
	
	
}
