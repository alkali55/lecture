package webjis;

public class ParseManager {

	public static Parseable getParser(String fileName) {

		Parseable result = new NoParser();
		
		
		if (fileName != null) {
			String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
			System.out.println("파일의 확장자 : " + ext);
			
			if (ext.equals("json")) {
				result = new JasonParser();
			} else if (ext.equals("xml")) {
				result = new XmlParser();
			} 
		}
		return result;
	}
	
	
	
}
