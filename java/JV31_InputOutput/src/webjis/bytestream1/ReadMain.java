package webjis.bytestream1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadMain {

	public static void main(String[] args) {
		
		InputStream is = null;
		
		try {
			 is = new FileInputStream("C:\\test\\test1.dat");
			
//			int data = is.read();
//			System.out.println(data); // 10
//			
//			data = is.read();
//			System.out.println(data); // 20
//			
//			data = is.read();
//			System.out.println(data); // 30
//			
//			data = is.read();
//			System.out.println(data); // -1
			
			while(true) {
				int data = is.read();
				if(data == -1) break;
				System.out.println(data);
			}
			
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
