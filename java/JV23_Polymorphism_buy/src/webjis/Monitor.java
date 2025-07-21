package webjis;

public class Monitor extends Product{
	Monitor(int price, String modelNum){
		super(price, modelNum);
	}

	@Override
	public String toString() {
		return "Monitor [toString()=" + super.toString() + "]";
	}
}
