package webjis.strstream1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrBufferReadMain {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\lecture\\java\\JV31_InputOutput\\src\\webjis\\bytestream1\\ReadMain.java")));
			
//			BufferedReader br = new BufferedReader(new FileReader("C:\\lecture\\java\\JV31_InputOutput\\src\\webjis\\bytestream1\\ReadMain.java"));
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if( br != null) {
					br.close();
					System.out.println("br 를 닫습니다.");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		try {
//			br.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
