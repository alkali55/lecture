package webjis.loosecoupling;

public class MultiRemoteController implements Remotable{
	
	
	@Override
	public void remoteControl(ElectronicDevice e) {
		System.out.println(e + " 원격 제어 합니다...");
		e.powerOn();
	}
	
}
