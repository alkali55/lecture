
public class StringEx {

	public static void main(String[] args) {
		
		int sum = 10 + 20 + 30;
		System.out.println("sum : " + sum);

		String sum1 = 10 + 20 + "30";
		System.out.println("sum1 : " + sum1); // 3030
		
		String sum2 = 10 + "20" + 30; // "1020" + 30
		System.out.println("sum2 : " + sum2); // 102030
		
		String sum3 = "10" + 20 + 30;
		System.out.println("sum3 : " + sum3); // 102030
		
		String sum4 = "10" + (20 + 30);
		System.out.println("sum4 : " + sum4); // 1050
		
		int userInput1 = Integer.parseInt("10");
		double userInput2 = Double.parseDouble("3.14");
		boolean userInput3 = Boolean.parseBoolean("true");
		
		System.out.println(userInput1);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(false);
		
		//
		String str4 = "대한민국";
		String str5 = "대한민국";
		System.out.println(str4 == str5); // true (주소값)
		
		String str6 = new String("우리나라");
		String str7 = new String("우리나라");
		System.out.println(str6 == str7); // false (주소값)
		
		String str8 = "자바";
		String str9 = new String("자바");
		System.out.println(str8 == str9); // false
		System.out.println(str8.equals(str9)); // 문자열 값 자체만 비교하고자 할 때는, equals()메서드를 이용해야 한다.
		
		
		
	}

}
