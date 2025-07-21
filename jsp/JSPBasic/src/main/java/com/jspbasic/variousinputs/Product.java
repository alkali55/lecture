package com.jspbasic.variousinputs;

public class Product {
	private String prodName;
	private int quantity;
	private int price;
	private String color;
	
	public Product(String prodName, int quantity, int price, String color) {
		super();
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
		this.color = color;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", quantity=" + quantity + ", price=" + price + ", color=" + color
				+ "]";
	}
	
	
}
