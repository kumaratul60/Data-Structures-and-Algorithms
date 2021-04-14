package Recursion_ADV;

import java.util.Scanner;

public class MoveAllX {

	public static void main(String[] args) {
		
		
		System.out.println(moveX("axxbdxcefxhix"));

	}

	static String moveX(String s) {
		if (s.length() == 0)
			return "";

		char ch = s.charAt(0);
		String res = moveX(s.substring(1));

		if (ch == 'x')
			return res + ch;
		else
			return ch + res;

	}

}
