package NinzaPattern;

import java.util.Scanner;

public class p8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;

		while(i<=n) {
			char p = (char)('A'+i-1);
			int j=1;
			//while(j<=n)
			while(j<=i)
			{
//				System.out.print(p);
//				 p = (char)(p+1);
				System.out.print((char)(p+j-1));
				j +=1;
			}
			i+=1;
			System.out.println();
		}
	}

}
