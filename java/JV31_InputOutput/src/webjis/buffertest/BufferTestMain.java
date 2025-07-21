package webjis.buffertest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferTestMain {

	public static void main(String[] args) throws IOException{

		String originalFilePath = "C:\\test\\copy.jpg";
		String copyFilePath = "C:\\test\\copyCopy.jpg";
		
		String originalFilePath2 = "C:\\test\\copy.jpg";
		String copyFilePath2 = "C:\\test\\copyCopy2.jpg";
		
		// 입출력 스트림 생성
		FileInputStream fis = new FileInputStream(originalFilePath);
		FileOutputStream fos = new FileOutputStream(copyFilePath);
		
		copy(fis, fos); // 1255043100
		
		fis.close();
		fos.close();
		
		// 입출력 스트림 + 버퍼 스트림
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(copyFilePath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		copy(bis, bos); // 9552300
		
		bis.close();
		bos.close();
		
	}

	private static void copy(InputStream is, OutputStream os) throws IOException{
		long start = System.nanoTime();
		
		while(true) {
			int data = is.read();
			if (data == -1) break;
			
			os.write(data);
		}
		
		os.flush(); // 버퍼 비우기
		
		long end = System.nanoTime();
		System.out.println(end - start); // 나노초
		
	}

}
