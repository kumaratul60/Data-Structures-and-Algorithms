package String.java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class S10_concatString {
   public static void main(String[] args) throws IOException {
	String s1,s2;
	BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
	System.out.println("Enter two String ");
	s1 = bf.readLine();
	s2 = bf.readLine();
	
	int l1 = s1.length();
	int l2 = s2.length();
	
	
	
	
	
	
 	/* public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two String");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		*/
		
	
	// String s3 = s1 + s2;
	String s3 = s1.concat(s2);
	int l3 = l1+l2;
	System.out.println("comp String is = "+s3);
	
	System.out.println("l1 length = " +l1);
	System.out.println("l2 length = "+l2);
	
	System.out.println("comp String length is = "+l3);
	
		
		
		
		
	}
	
	
}

