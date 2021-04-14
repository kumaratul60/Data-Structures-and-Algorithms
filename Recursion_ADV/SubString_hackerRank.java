package Recursion_ADV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubString_hackerRank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		ArrayList<String> ans = powerSet(s);

		Collections.sort(ans);
		

		for (String st : ans)
			System.out.println(st);

	}

	static ArrayList<String> powerSet(String s) {

		ArrayList<String> ans = new ArrayList<>();

		subSeq(s, "", ans);
		Collections.sort(ans);
		ans.remove(0);

		return ans;
	}

	static void subSeq(String ip, String op, ArrayList<String> ans) {

		if (ip.length() == 0) {
			ans.add(op);
			return;
		}

		subSeq(ip.substring(1), op, ans);
		subSeq(ip.substring(1), op + ip.charAt(0), ans);

	}
	

}
