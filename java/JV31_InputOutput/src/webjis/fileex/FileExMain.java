package webjis.fileex;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class FileExMain {

	public static void main(String[] args) {

		// 현재 디렉토리의 File객체 생성
//		File curDirectory = new File(".");
		
		
//		System.out.printf("%6d", 123);
//		System.out.println();
//		System.out.printf("%-6d %10.2f \n", 123, 123.2);
		
//		DecimalFormat df = new DecimalFormat("#,###");
//		System.out.println(df.format(12345L));
		Scanner sc = new Scanner(System.in);
		String curDir = "C:\\Users\\goott5";
		while(true) {
			
			System.out.println(curDir);
			String input = sc.nextLine();
			
			if(input.equals("dir")) {
				
				showDir(curDir);
				
			} else if (input.indexOf("cd") == 0) {
				
				String tmp = input.substring(3);
				File curDirectory = new File(curDir);
				File[] files = curDirectory.listFiles();
				
				boolean isFind = false;
				
				for(File file : files) {
					if(file.getName().equals(tmp)) {
						isFind = true;
					}
				}
				
				if(isFind) {
					curDir += "\\" + tmp;
				} else if (tmp.equals("/")) {
					curDir = "C:\\";
				} else if (tmp.equals("../")) {
					curDir = curDirectory.getParent();
				}
				
			}
		}
//		showDir(curDir);
//		String aa = sc.next();
//		System.out.println(aa.substring(2));
		
	}

	private static void showDir(String curDir) {
		
		String dir = curDir;
		File curDirectory = new File(dir);
		
		File[] files = curDirectory.listFiles();
//		System.out.println(Arrays.toString(files));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		DecimalFormat df = new DecimalFormat("#,###");
		
		int fileCnt = 0;
		int dirCnt = 0;
		int totalFileSize = 0;
		
		System.out.println(dir + " 디렉터리");
		for (File file : files) {
//			System.out.println(file.lastModified());
			System.out.print(sdf.format(file.lastModified()));
			if(file.isDirectory()) {
				System.out.printf("%10s", "<DIR>");
				System.out.printf("%10s", "");
				dirCnt++;
			} else {
				System.out.printf("%10s", "");
				System.out.printf("%10d", file.length());
				fileCnt++;
				totalFileSize += file.length();
			}
			System.out.print(" " + file.getName());
			System.out.println();
		}
		
		System.out.printf("%10d", fileCnt);
		System.out.print("개 파일");
		System.out.printf("%20s", df.format(totalFileSize));
		System.out.print(" 바이트");
		
		System.out.println();
		
		System.out.printf("%10d", dirCnt);
		System.out.print("개 디렉터리");
		System.out.printf("%20s", df.format(curDirectory.getFreeSpace()));
		System.out.print(" 바이트 남음");
		
		System.out.println();
	}

}
