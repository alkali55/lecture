package webjis;

public class Tv extends Product{
	
	Tv(int price, String modelNum){
		super(price, modelNum);
	}

	@Override
	public String toString() {
		return "Tv [toString()=" + super.toString() + "]";
	}
	
	
}
