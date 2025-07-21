package webjis;

public class ParseService {
	
	public void processParse(String fileName) {
		
//		String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
//		System.out.println("파일의 확장자 : " + ext);
//		if (ext.equals("json")) {
//			JasonParser jasonParser = new JasonParser();
//			jasonParser.parse();
//		} else if (ext.equals("xml")) {
//			XmlParser xmlParser = new XmlParser();
//			xmlParser.parse();
//		}
		
		Parseable parser = ParseManager.getParser(fileName);
		
		if(parser.parse()) {
			System.out.println("파싱 완료");
		} else {
			System.out.println("파싱 실패");
		}
		
	}
}
