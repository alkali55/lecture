package webjis.stackbrowser;

public class StackBrowserMain {

	public static void main(String[] args) {
		// 브라우저의 뒤로/앞으로 기능
		// 방문 사이트 : 홈페이지 > 네이버 > 다음 > 쿠팡 > 자바API
		// 뒤로가기 : goBack()
		
		WebHistory webHistory = new WebHistory();
		
		webHistory.visitPage("홈페이지");
		webHistory.visitPage("네이버");
		webHistory.visitPage("다음");
		webHistory.visitPage("쿠팡");
		webHistory.visitPage("자바API");
		
		webHistory.goBack();
		webHistory.goBack();
		webHistory.goBack();
		webHistory.goBack();
		webHistory.goBack();
		
	}

}
