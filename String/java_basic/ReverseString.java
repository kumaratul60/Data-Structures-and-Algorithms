package String.java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Reverse {
	public static String Atulreverse(String s)
	{
		//String s1 = "Atul";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		return sb.toString();
	}
 }
public class ReverseString {
public static void main(String[] args) throws IOException {
	
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the text");
	String s = bf.readLine();
	System.out.println(Reverse.Atulreverse(s));

}		
}
