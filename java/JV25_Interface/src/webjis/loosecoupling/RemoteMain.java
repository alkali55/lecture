package webjis.loosecoupling;

public class RemoteMain {

	public static void main(String[] args) {

		Tv tv = new Tv("LG");
		tv.powerOn();
		
		MultiRemoteController mrc = new MultiRemoteController();
		mrc.remoteControl(tv);
		
		Washer washer = new Washer("Samsung");
		mrc.remoteControl(washer);

	}

}
