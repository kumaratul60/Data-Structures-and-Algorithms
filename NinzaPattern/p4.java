package NinzaPattern;

import java.util.Scanner;

public class p4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int p=1;
	  int i=1;
	  while(i<=n) {
		 int p = i;
		  int j = 1;
		  while(j<=i) {
			  System.out.print(p);
			  p += 1;
			  j = j+1;
			 
		  }
		  i += 1;
		  System.out.println();
	  }

	}

}
