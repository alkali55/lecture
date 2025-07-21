package webjis.custom;

public class NotPostiveInteger extends Exception{
	
	// 사용자 정의 예외 클래스
	
	private int errorCode = 103;
	private String msg;
	
//	public NotPostiveInteger() {
//		
//	}
	
	public NotPostiveInteger(String message) {
//		super(message);
		msg = message;
	}
	

	@Override
	public String getMessage() {
		
//		return "양의 정수가 아닙니다.";
		return "에러 코드: " + errorCode + ", " + msg;
	}
	
	
	
}
