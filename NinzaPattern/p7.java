package NinzaPattern;

import java.util.Scanner;

public class p7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) {
			int j=1;
		/*	while(j<=i+1) {
				char val = 'A';
				//val = (char)(val+i-j+1);
				 val = (char)(val+i);
				 */
			while(j<=i) {
				char val = (char)('A'+i-1);
				System.out.print(val);
				//val +=1;
				j += 1;
		
			}
			System.out.println();
			i += 1;
			
		}
	}

}
