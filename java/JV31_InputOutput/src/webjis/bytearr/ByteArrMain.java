package webjis.bytearr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrMain {

	public static void main(String[] args) {

		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // 원본 (데이터 출발지)
		byte[] outSrc = null;
		
		InputStream input = new ByteArrayInputStream(inSrc); 
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			while((data = input.read()) != -1) {
				System.out.println(data);
				output.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		outSrc = output.toByteArray(); // output에 있는 데이터를 byte[]로 변환
		System.out.println(Arrays.toString(outSrc));
		

	}

}
