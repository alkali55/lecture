package webjis;

public class ParseMain {

	public static void main(String[] args) {

		ParseService service = new ParseService();
//		
		service.processParse("data.json");
		// json 파일을 파싱합니다....
		
		service.processParse("data.xml");
		// xml 파일을 파싱합니다....
		
		service.processParse("data.dat");
		service.processParse(null);
		
//		String fileName = "dataaa.json";
//		System.out.println(fileName.lastIndexOf(".")); // 뒤에서부터 찾아서 인덱스 반환
//		int ind = fileName.lastIndexOf(".");
//		System.out.println(fileName.substring(ind + 1)); // 주어진 인덱스 포함해서 끝까지 반환
	}

}
