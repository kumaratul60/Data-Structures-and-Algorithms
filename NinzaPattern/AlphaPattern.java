package NinzaPattern;

import java.util.Scanner;

public class AlphaPattern {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int i=1;
		 
		 while(i<=n) {
			// char ch = (char)('A'+n-1);
			 char ch = (char)('A'+i-1);

			 int j =1;
			// while(j<=n) 
			 while(j<=i)
			 
			 {
				 System.out.print(ch);
			     j +=1;
	            }
	            System.out.println();
	            i += 1;
		 }
	}

}
