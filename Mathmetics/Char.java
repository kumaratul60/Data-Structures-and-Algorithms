package Mathmetics;

import java.util.Scanner;

public class Char {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        char ch = s.charAt(0);
	      //  int n = sc.nextInt();
	        
	        if(ch>='A' && ch<= 'Z')
	        	System.out.println(1);
	        else if(ch>='a' && ch<= 'z')
	        	System.out.println(0);
	        else System.out.println(-1);
	}

}
