package webjis.trywithresource;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceMain {

	public static void main(String[] args) {
		
		String filePath = "C:\\test\\score.dat";
//		BufferedReader br = null;
		
//		try {
//			br = new BufferedReader(new FileReader(filePath));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("파일을 찾을 수 없습니다.");
//		} finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		// try-with-resource
		// 자동으로 close() 호출을 해준다. 단, AutoCloseable인터페이스를 구현한 것이어야 한다.
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath));
			DataInputStream dis = new DataInputStream(new FileInputStream(filePath))){
			
			System.out.println(br);
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
