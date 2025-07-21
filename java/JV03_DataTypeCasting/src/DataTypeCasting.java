
public class DataTypeCasting {

	public static void main(String[] args) {
		// 묵시적(자동) 형변환 : 프로그래머가 형변환 연산자를 쓰지 않더라도 자동으로 형 변환.
		// byte --> int
		byte b = 125;
		System.out.println(b);
		
		int i = b;
		System.out.println("i : " + i);
		
		// int --> float
		float f = 1234;
		// 원래는 아래와 같이 형변환을 해줘야 하지만, 생략할 수 있다.
		float f1 = (float)1234;
		System.out.println(f); // f : 1234.0
		System.out.println(f1); 
		
		// char --> int 
		i = 'A';
		System.out.println(i); // 65
		// int --> char
		System.out.println((char)i); // 명시적 형변환
		
		// float --> int // 명시적 형변환
//		int j = 3.14f; // Type mismatch: cannot convert from float to int
		int j = (int)3.74f; 
		System.out.println("j : " + j); // 3 (소숫점 버림.)
		
		// int --> byte
		int i2 = 300; // 이진법으로 100101100
//		byte b2 = i2; // Type mismatch: cannot convert from int to byte
		byte b2 = (byte)i2; // 8비트까지의 00101100만 남음
		System.out.println("b2 : " + b2); // 44 (값 손실)
		
		//
		byte b3 = 100; // 리터럴 상수 이용하는 경우
//		byte b4 = b3;
		
		// 예외
		int i3 = 100; // i3라는 변수를 이용해서 byte 타입으로 형변환
//		byte b5 = i3; // Type mismatch: cannot convert from int to byte
		byte b5 = (byte)i3;
		System.out.println(b5);
		
		// double --> float
		double pi = 3.141592;
//		float fpi = pi; // Type mismatch: cannot convert from double to float
		float fpi = (float)pi;
		System.out.println("fpi : " + fpi);
		
		// int --> short
		int i4 = 32767;
//		short s = i4; // Type mismatch: cannot convert from int to short
		short s = (short)i4;
		System.out.println("s : " + s);
		
		int i5 = 32768;
		short s1 = (short)i5; // overflow 발생 
		System.out.println("s1 : " + s1); // -32768
		
		int i6 = -32769;
		short s2 = (short)i6; // underflow 발생
		System.out.println("s2 : " + s2); // 32767
		
		// short --> char
		short s4 = 97;
//		char char1 =  (short)s4; // Type mismatch: cannot convert from short to char
		char char1 = (short)97;
		System.out.println("char1 : " + char1); // a
		
		// 연산식
		byte bSum = 10 + 20; // 30
		System.out.println("bSum : " + bSum);
		
		//
		byte b6 = 10;
		byte b7 = 20;
//		byte bResult = b6 + b7; // Type mismatch: cannot convert from int to byte
		// int타입보다 작은 타입의 피연산자는 int로 변환하여 계산한다.
		
		byte bResult = (byte)(b6 + b7);
		System.out.println("bResult : " + bResult);
		
		int iResult = b6 + b7;
		System.out.println("iResult : " + iResult);
		
		//
		long l3 = 50L;
		int i7 = 60;
		
//		int iResult2 = l3 + i7; // Type mismatch: cannot convert from long to int
		// int 타입과 long 타입 연산 : 더 큰 타입으로 형변환해서 계산을 실행한다.
		int iResult2 = (int)(l3 + i7);
		System.out.println("iResult2 : " + iResult2);
		
//		float f3 = 3.1f + 4.3; // Type mismatch: cannot convert from double to float
		float f3 = (float)(3.1f + 4.3);
		System.out.println("f3 : " + f3);
		
		// int와 float
		int intNum1 = 1;
		int intNum2 = 2;
		float divNum1 = intNum1 / intNum2; // 1 / 2
		System.out.println("divNum1 : " + divNum1);
		
		float divNum2 = (float)intNum1 / intNum2;
		System.out.println("divNum2 : " + divNum2);
		
		float divNum3 = intNum1 /(float) intNum2;
		System.out.println("divNum3 : " + divNum3);
		
		float divNum4 = (float)intNum1 / (float)intNum2;
		System.out.println("divNum4 : " + divNum4);
		
	}

}
