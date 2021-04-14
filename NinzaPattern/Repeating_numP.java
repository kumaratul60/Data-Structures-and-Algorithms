package NinzaPattern;

import java.util.Scanner;

public class Repeating_numP {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		   int i,j,c,k;
	       k=1;
	        c=1;
	        i=1;
	        
	        while(i<=n)
	        {
	            j=1;
	           while(j<=c) {
	        	   System.out.print(k);
	              k++;
	            if(k>9)
	                k=1;
	            j++;
	           }
	            System.out.println();
	            i++;
	         c*=2;
	        }
	}

}
