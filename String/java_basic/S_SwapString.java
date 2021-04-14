package String.java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_SwapString {
public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter two string");
	String a = bf.readLine();
	String b = bf.readLine();
	System.out.println("Before swap :"+a+ " "+b);
	a = a+b;
	b = a.substring(0,a.length()-b.length());
	a = a.substring(b.length());
	System.out.println("After Swap : "+a+" "+b);
}
}
