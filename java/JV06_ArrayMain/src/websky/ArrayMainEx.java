package websky;

import java.util.Arrays;

public class ArrayMainEx {

	public static void main(String[] args) {
		System.out.println("length of args in main : " + args.length);
		System.out.println(Arrays.toString(args));
		
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				if (args[i].equals("\\w")) {
					System.out.println("P   r   i   n   t   w   i   d   e");
				}
			}
		}
		
	}

}
