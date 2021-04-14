package String.java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReder {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter the String");
		String s = bfr.readLine();
		System.out.println("Atul-> "+s);
	}

}
