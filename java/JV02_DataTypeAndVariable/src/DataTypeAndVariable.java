
public class DataTypeAndVariable {

	public static void main(String[] args) {
		
		// boolean : true 또는 false (1 byte)
		boolean bool = true;
		System.out.println(bool);
		
		// char : 문자형 (2 byte) - 한 문자를 저장할 수 있다.
		char character = '\u0041'; // A
		System.out.println(character);
		
		char korChar = '가';
		System.out.println(korChar);
		System.out.println("char타입의 최대값" + Character.MAX_VALUE + "]");
		System.out.println("char타입의 최소값" + Character.MIN_VALUE + "]");
		
		// byte : 정수형 (1byte)
		byte b = 127;
		System.out.println(b);
		
//		b = b + 1; // Type mismatch: cannot convert from int to byte
		
		System.out.println("byte타입의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte타입의 최소값 : " + Byte.MIN_VALUE);
		
		// short : 정수형 (2byte)
		short sInt = 128;
		System.out.println(sInt);
		System.out.println("short타입의 최대값 : " + Short.MAX_VALUE);
		System.out.println("short타입의 최소값 : " + Short.MIN_VALUE);
		
		// int : 정수형 (4byte)
		int i = 35;
		System.out.println(i);
		System.out.println("int타입의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int타입의 최소값 : " + Integer.MIN_VALUE);
		
		// long : 정수형 (8byte)
		long l = 35;
		long l1 = 35L; // 35l
//		long l2 = 10_000_000_000; // The literal 10_000_000_000 of type int is out of range (int범위 밖)
		long l2 = 10_000_000_000L;
		
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println("long타입의 최대값 : " + Long.MAX_VALUE);
		System.out.println("long타입의 최소값 : " + Long.MIN_VALUE);
		
		// float : 실수형 (4byte) (default는 double타입이다)
//		float f = 3.14; // Type mismatch: cannot convert from double to float
		float f = 3.14F; // 3.14f (f, F : 접미사)
		System.out.println(f);
		System.out.println("float타입의 최대값 : " + Float.MAX_VALUE);
		System.out.println("float타입의 최소값 : " + Float.MIN_VALUE);
		
		
		// double : 실수형 (8byte)
		double d = 3.14; // 3.14D, 3.14d
		System.out.println(d);
		System.out.println("double타입의 최대값 : " + Double.MAX_VALUE);
		System.out.println("double타입의 최소값 : " + Double.MIN_VALUE);
		
		// 2진법, 8진법, 16진법 수
		int binNum = 0b10;
		System.out.println(binNum);
		
		int octNum = 010;
		System.out.println(octNum);
		
		int hexNum = 0x10;
		System.out.println(hexNum);
	}

}
