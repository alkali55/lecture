package webjis.korean;

import java.util.ArrayList;

public class Korean {
	
	private String regNo;
	private String name;
	private int hashCode;
	private static ArrayList<Korean> korArr = new ArrayList<Korean>();
	
	Korean(String regNo, String name){
		this.regNo = regNo;
		this.name = name;
		
		
	}

	public int hashCode() {
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		Korean kor = (Korean)obj;
//		obj = (Korean)obj;
		
		if (this.regNo.equals(kor.regNo) && this.name.equals(kor.name)) {
			return true;
		} else {
			return false;
		}
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
		return "Korean [regNo=" + regNo + ", name=" + name + "]";
	}
}
