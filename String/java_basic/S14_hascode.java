package String.java_basic;

import java.util.Scanner;

public class S14_hascode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		System.out.println("String hascode is =" +s.hashCode()+"  "+s1.hashCode());
	
	}

}
