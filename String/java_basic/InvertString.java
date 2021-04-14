package String.java_basic;

import java.util.Scanner;

public class InvertString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
	}

}
