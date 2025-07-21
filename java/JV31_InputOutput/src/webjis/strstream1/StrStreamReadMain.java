package webjis.strstream1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class StrStreamReadMain {

	public static void main(String[] args) {

		try (InputStream is = new FileInputStream("C:\\test\\strtest.txt");
				Reader reader = new InputStreamReader(is)) {
			
			// 1글자씩 읽어오기
			while(true) {
				int data = reader.read();
				if(data == -1)break; 
				System.out.println((char)data); // data = 65, (char)data = A
			}
			
			Reader reader1 = new FileReader("C:\\test\\strtest.txt");
			// 문자 배열로 읽어오기
			char[] data = new char[50];
			
			int num = reader1.read(data);
			System.out.println("num=" + num); // 8
			System.out.println(data); // ABCDEAAA
			
			reader1.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
