// 한줄 주석
/* 
 * 여러줄 주석
 */

public class HelloJava { // HelloJava클래스의 시작

	public static void main(String[] args) { // main메서드 (프로그램의 실행 시작점)의 시작
		 System.out.println("Hello, JAVA!"); // ln - new line (줄바꿈함)
		 System.out.println("헬로우, 자바!");
		 System.out.print("안녕하세요"); // print() 줄바꿈하지 않음
		 System.out.print("자바를 시작합니다");

	} // main메서드의 끝

} // HelloJava클래스의 끝

class HelloA {
//public class HelloA { // 에러 : The public type HelloA must be defined in its own file
	static void sayHello() {
		System.out.println("HelloA 클래스");
	}
}