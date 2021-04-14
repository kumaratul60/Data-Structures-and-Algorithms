package String.java_basic;

import java.util.Scanner;

public class ExtractDigit {
	public static void main(String[] args) {
		String s = "This is Atul 16310";

			System.out.println(s.replaceAll("[^0-9]", ""));

	
		//System.out.printf(s.replaceAll("[^0-9]", ""),s);
	//	System.out.println(s.replaceAll("[^0-9]",s));
	}

}
