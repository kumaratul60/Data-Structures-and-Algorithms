package String.java_basic;

import java.util.Scanner;

public class StringTo_Integer {
	public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      String s = sc.nextLine();
      int result = Integer.parseInt(s);   // Using Integer.parseInt()
      System.out.println(result);
		
      Integer result1 = Integer.valueOf(s);  // Unsing Integer.valueOf()
       System.out.println(result1);
		
	}

}
