package webjis.bytestream1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteMain2 {

	public static void main(String[] args) {

		try (OutputStream os = new FileOutputStream("C:\\test\\test2.dat")) {
			byte[] array = {10, 20, 30, 40, 50};
			
			os.write(array);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
