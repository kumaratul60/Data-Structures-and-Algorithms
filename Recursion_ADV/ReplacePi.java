package Recursion_ADV;

import java.util.Scanner;

public class ReplacePi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String ip = "pippppiiiipi";
			replace(ip);
		}
	}

	static void replace(String str) {
		if (str.length() == 0)
			return;
		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			System.out.print("3.14");
			replace(str.substring(2));
			//System.out.println();
		} else
			System.out.print(str.charAt(0));
		replace(str.substring(1));
	}

}
