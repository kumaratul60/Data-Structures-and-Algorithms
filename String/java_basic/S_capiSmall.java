package String.java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_capiSmall {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String s = bf.readLine();
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		
				
	}

}
