package NinzaPattern;

import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) {
			int j=1;
			//while(j<=i) 
		//	while(j<=i+1)
			while(j<=n)
			{
				
			char jth = (char)('A' + j-1);
				System.out.print(jth);
				j += 1;
			}
			System.out.println();
			i += 1;
			
		}
	}

}
