package webjis;

import java.util.Arrays;

public class Figure {
	
	private String name;
	private String color;
	private int[] startingPoint = new int[2];
	
	Figure(String name, String color, int x, int y) {
		this.name = name;
		this.color = color;
		this.startingPoint[0] = x;
		this.startingPoint[1] = y;
		
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
	public String displaySP() {
		return Arrays.toString(startingPoint);
	}
	
}
