package NinzaPattern;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	  int i=1;
	  while(i<=n) {
		  int j = 1;
		  while(j<=n) {
			 // System.out.print('*');
			 // System.out.print(i);
			  System.out.print(j);
			//System.out.print(n-j+1);
		  // System.out.print(n);
			


			  j = j+1;
		  }
		  i += 1;
		  System.out.println();
	  }

	}

}
