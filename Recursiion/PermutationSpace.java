package Recursiion;

import java.util.Scanner;

public class PermutationSpace {
	public static void permutationWithSpace(String input, String output) {
		if (input.length() == 1) {
			System.out.print("(" + output + input + ")");
			return;
		}
		permutationWithSpace(input.substring(1), output + input.charAt(0) + " ");
		permutationWithSpace(input.substring(1), output + input.charAt(0));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc -- > 0) {
			String input = sc.next();
			String output = "";
			permutationWithSpace(input, output);
			System.out.println();
		}
		sc.close();
	}
	
}
