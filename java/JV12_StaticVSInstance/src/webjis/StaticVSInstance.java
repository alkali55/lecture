package webjis;

public class StaticVSInstance {
	
	// 기본값 자동 초기화
//	static int sInt; // 클래스 변수 : 0
//	int iInt; 		 // 인스턴스 변수 : 0
	
	// 명시적 초기화
	static int sInt = 1000;
	int iInt = 2000;
	
	// 초기화 블럭
	{
		// 인스턴스 멤버 초기화
		System.out.println("iInt의 초기값 : " + iInt);
		
		iInt = 0;
		System.out.println("instance 초기화 블럭{ } : " + iInt);
	}
	
	static {
		// static 멤버를 초기화
		System.out.println("sInt의 초기값 : " + sInt);
		
		sInt = 0;
		System.out.println("static 초기화 블럭{ } : " + sInt);
	}
	
	public void acc() {
		sInt++;
		iInt++;
		System.out.println("no : " + this.hashCode() + ", sInt : " + StaticVSInstance.sInt + ", iInt : " + this.iInt);
	}
	
	public static void main(String[] args) {
//		System.out.println(sInt);
//		
//		StaticVSINstance svi = new StaticVSINstance();
//		System.out.println(svi.iInt);
		
//		StaticVSINstance svi = new StaticVSINstance();
		for (int i = 0; i < 10; i++) {
			StaticVSInstance svi = new StaticVSInstance();
			svi.acc();
		}
		
	}

}
