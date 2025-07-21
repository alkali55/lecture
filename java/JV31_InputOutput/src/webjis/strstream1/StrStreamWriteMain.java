package webjis.strstream1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class StrStreamWriteMain {

	public static void main(String[] args) {

		try {
			
//			OutputStream os = new FileOutputStream("C:\\test\\strtest.txt");
//			Writer writer = new OutputStreamWriter(os);
//			OutputStreamWriter writer = new OutputStreamWriter(os);
			
			Writer writer = new FileWriter("C:\\test\\strtest.txt");
			
			// 1 문자씩
			char a = 'A';
			writer.write(a);
			
			char b = 'B';
			writer.write(b);
			
			char c = 'C';
			writer.write(c);
			
			// char[]
			char[] arr = {'D', 'E'};
			writer.write(arr);
			
			// 문자열
			writer.write("AAA");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
