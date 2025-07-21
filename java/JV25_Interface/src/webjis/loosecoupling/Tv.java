package webjis.loosecoupling;

public class Tv implements ElectronicDevice{
	
	private String brandName;
	
	
	
	Tv(String brandName){
		this.brandName = brandName;
	}
	
	@Override
	public void powerOn() {
		System.out.println(this + " 켜집니다....");
	}
	
	@Override
	public String toString() {
		return "Tv [brandName=" + brandName + "]";
	}
}
