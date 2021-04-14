package NinzaPattern;

import java.util.Scanner;

public class InterensingPtrn {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int i=1;
		 
		 while(i<=n) {
			 char ch = (char)('A'+n-i);
			 int j=1;
			 while(j<=i) {
				 System.out.print((char)(ch+j-1));
				// ch += 1;
				 j+=1;
			 }
			 
			 
		/* char ch = (char)('A'+n-1);
	        while(i<=n){
	            int j=1;
	            char ch2 = (char)(ch-i-j+2);
	            while(j<=i) {
	                System.out.print(ch2);
	                ch2 = (char)(ch2+1);
	                j += 1;
	            }
	            */
			 
			 System.out.println();
			 i += 1;
		 }	 
	}
}
