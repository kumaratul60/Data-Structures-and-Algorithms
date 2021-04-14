package Fundamentals;

import java.util.Scanner;

public class BinaryConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			binary(n);
		}
	}

	static void binary(int n) {
		
		
		int[] binary = new int[n]; // array to store binary number 

		 // counter for binary array 
		int i = 0;
		while (n > 0) {

			// storing remainder in binary array 
			binary[i] = n % 2;
			n /= 2;
			i++;
		}
		// printing
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binary[j]);

	}

}
