package webthc;

public class Electronics {

	private int price;
	private int point;
	
	public Electronics(int price) {
		this.price = price;
		this.point = Math.round(price / 10f);
		
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Electronics [price=" + price + ", point=" + point + "]";
	}
}
