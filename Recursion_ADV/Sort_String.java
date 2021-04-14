package Recursion_ADV;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String ip = sc.next();
			String op = "";

			 subSeq(ip, op);
			//System.out.println(sortString(ip));
		}

	}

	static void subSeq(String ip, String op) {

		// sortString(ip);

		if (ip.length() == 0) {
			System.out.println(op);
			return;
		}

		subSeq(ip.substring(1), op);
		subSeq(ip.substring(1), op + ip.charAt(0));

		// sortString(ip);

	}

	public static String sortString(String inputString) {
		// convert input string to char array
		char tempArray[] = inputString.toCharArray();

		// sort tempArray
		Arrays.sort(tempArray);

		// return new sorted string
		return new String(tempArray);
	}

}
