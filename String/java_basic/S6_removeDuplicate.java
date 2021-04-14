package String.java_basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class S6_removeDuplicate {
 public static void main(String[] args) {
// String s = "java";
	 Scanner sc = new Scanner(System.in);
	 System.out.print("enter the word = ");
	 String s = sc.nextLine();
	System.out.println(removeDuplicates(s));
 }
 public static String removeDuplicates(String s)
 {
	 Set<Character> set = new HashSet<>();
	 StringBuffer sb = new StringBuffer();
	 for(int i=0;i<s.length();i++)
	 {
		 Character c = s.charAt(i);
		 if(!set.contains(c))
		 {
			 set.add(c);
			 sb.append(c);
		 }
	 }
	 return sb.toString();
}
}
