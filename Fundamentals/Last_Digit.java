package Fundamentals;


	import java.util.*;
	import java.io.*;

	public class Last_Digit {
	  public static void main(String args[]) throws IOException {
	    
	    //write your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int temp = 0;
	    temp = n%10;
	    System.out.println(temp);
	  }
}
