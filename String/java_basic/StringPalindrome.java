package String.java_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Palindromrchecker{
	public static boolean isPalindrome(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		// StringBuilder sb =new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString()
;
		if(s.equals(rev))
	       return true	;
		else
			return false;
	}
}
public class StringPalindrome {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s = bf.readLine();
		System.out.println(Palindromrchecker.isPalindrome(s));
		
				
	}

}
