package webjis.exceptionthrow;

public class ThrowMain {

	public static void main(String[] args) {
		
		Student student = null;
		
		try {
			
			student = new Student("24001", "홍길동", -80, 90, 70);
//			student = new Student("24001", "홍길동", 80, 90, 70);
			
			student.displayScore(); // 위의 문장에서 예외가 터지면 try 블럭안의 밑문장은 실행 x
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("점수를 출력할 수 없습니다.");
		}
		
		System.out.println(student);
		
	}

}
