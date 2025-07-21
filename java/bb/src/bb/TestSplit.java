package bb;

import java.util.Arrays;

public class TestSplit {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String test = "HELLOEXAMPLESENTENCE";
//		String[] output = test.split("E");
//		
//		
//		boolean[] ary = new boolean[256];
//		System.out.println(Arrays.toString(ary]));
//	
//
//	}
	
	 public static void main (String[] args) {
			 String str="abacabcd";
			 boolean[] ary=new boolean[256];
			 System.out.print(fn(str, str.length()-1, ary));
		 }
	 
	 public static String fn(String str, int index, boolean[] ary) {
			 if(index < 0) return"";
			 char c = str.charAt(index);
			 System.out.println("c = " + c);
			 String result=fn(str, index-1, ary);
			 if(!ary[c]) {
			 ary[c]= true;
			 return c + result;
			 }
			 return result;
		 }


}
