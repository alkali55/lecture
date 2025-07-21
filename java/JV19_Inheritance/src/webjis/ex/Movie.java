package webjis.ex;

public class Movie extends Product{
	
	private String director;
	private String rate;
	
	Movie(String name, int price, String director, String rate){
		super(name, price);
		this.director = director;
		this.rate = rate;
	}
	
	@Override
	public String display() {
		return super.display() + " 감독 : " + director + ", 관람등급 : " + rate;
	}
		
//		void displayMovie() {
//			super.displayProduct();
//			System.out.println("감독 : " + director + ", 등급 : " + rate);
//		}
}
