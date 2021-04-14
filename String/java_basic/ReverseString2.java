package String.java_basic;

import java.util.Scanner;

public class ReverseString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String reverse = "";
		int length = s.length();
		for(int  i=length-1;i>=0;i--)
			reverse = reverse+s.charAt(i);
		System.out.println(reverse);
		System.out.println(s.length());
		
		
	}

}
