package webjis.bytestream1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class CopyImageMain {

	public static void main(String[] args) throws Exception {

		String originalFile = "C:\\lecture\\javascript\\images\\dongas.jpg";
		String copyFile = "C:\\test\\copy.jpg";
		
		InputStream is = new FileInputStream(originalFile);
		OutputStream os = new FileOutputStream(copyFile);
		
		byte[] data = new byte[1024];
		
		int i = 0;
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			System.out.println("num : " + num);
			
			os.write(data, 0, num);
			
			System.out.println("i : " + i++);
		}
		
		is.close();
		os.close();
	}

}
