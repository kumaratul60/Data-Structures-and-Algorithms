package Recursiion;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation_space {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			ArrayList<String> ptrn = new ArrayList<>();
			ptrn = spaceString(s);
			for (String strs : ptrn)
				System.out.println(strs);
		}
	}

	public static ArrayList<String> spaceString(String s) {
		ArrayList<String> str = new ArrayList<>();
		if (s.length() == 1) {
			str.add(s);
			return str;
		}
		ArrayList<String> strTemp = spaceString(s.substring(1, s.length()));
		for (int i = 0; i < strTemp.size(); i++) {
			str.add(s.charAt(0) + strTemp.get(i));
			str.add(s.charAt(0) + " " + strTemp.get(i));
		}
		return str;
	}
		
}
