package webthc.korean;

import java.util.Objects;

public class Korean1 {
	private String regNo;
	private String name;
	
	
	Korean1(String regNo, String name) {
		super();
		this.regNo = regNo;
		this.name = name;
	}
	
	// equals() 오버라이딩
	@Override
	public boolean equals(Object obj) { // k1.equals(k2)
		boolean result = false;
		
		if (obj instanceof Korean1) { // Korean1 ref = new Student(); ??
			Korean1 tmp = (Korean1)obj;
			
			if(this.regNo.equals(tmp.regNo) && this.name.equals(tmp.name)) {
				result = true;
			}
		}
		
		
		return result;
		
	}
	
	// hashCode() 오버라이딩
//	@Override
//	public int hashCode() {
//		return (this.regNo + this.name).hashCode();
//	}
	
	public int hashCode() {
		return Objects.hash(regNo, name);
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegNo() {
		return regNo;
	}
	@Override
	public String toString() {
		return "Korean1 [regNo=" + regNo + ", name=" + name + "]";
	}
}
