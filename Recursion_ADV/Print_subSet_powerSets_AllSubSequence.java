package Recursion_ADV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Print_subSet_powerSets_AllSubSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			// new LexSort();
			ArrayList<String> ans = LexSort.powerSet(s);
			Collections.sort(ans);
			
			for (String st : ans)
				System.out.print(st + " ");
			System.out.println();
		}
	}
}

class LexSort {
	static ArrayList<String> powerSet(String s) {
		ArrayList<String> ans = new ArrayList<>();
		subSeq(s, "", ans);
		Collections.sort(ans);
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
