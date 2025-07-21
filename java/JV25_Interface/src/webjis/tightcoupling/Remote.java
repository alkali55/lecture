package webjis.tightcoupling;

public class Remote {
	
	private Tv tv;
	
	public Remote() {
		tv = new Tv("Samsung");
	}
	
	public void turnOnTv() {
		tv.powerOn();
	}
}
