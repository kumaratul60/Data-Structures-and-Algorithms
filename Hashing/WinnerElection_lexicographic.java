package Hashing;

import java.util.HashMap;
import java.util.Map;

public class WinnerElection_lexicographic {

	public static void main(String[] args) {

	}

	public static String[] winner(String a[], int n) {
		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String val = a[i];
			int count = hm.get(val);
			if (hm.containsKey(a[i])) {
				count++;
				hm.put(val, count);
			} else
				hm.put(val, 1);
		}

		int max = Integer.MIN_VALUE;
		String temp = "";
		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			if (e.getValue() > max) {
				temp = e.getKey();
				max = e.getValue();
			}
		}
		String res[] = new String[2];
		res[0] = temp;
		res[1] = String.valueOf(max);
		return res;
	}

}
