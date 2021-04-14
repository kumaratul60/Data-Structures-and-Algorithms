package String.java_basic;

import java.util.Scanner;

public class ReverseString1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
   //  String s = sc.nextLine();
     String s = "Atul soft";
     
	int length = s.length();
	String reverse = "";
	for(int i=length-1;i>=0;i--)
        reverse = reverse+s.charAt(i);
	System.out.println(reverse);	
}

  }