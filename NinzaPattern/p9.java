package NinzaPattern;

import java.util.Scanner;

public class p9 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int i=1;
	        while(i<=n){
	            char ch = (char)('A'+i+3);
	            int j=1;
	            while(j<=i) {
	                System.out.print(ch);
	                ch = (char)(ch-1);

	                j += 1;
	            }
	            
	            System.out.println();
	            i += 1;
	        }
	}

}
