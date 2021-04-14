package Hashing;

import java.util.HashMap;

public class FirstRepated {

	public static void main(String[] args) {

		int n = 8;
		int a[] = { 1, 5, 3, 4, 3, 5, 6,5 };
		System.out.println(firstRepeated(a, n));

	}

	private static int firstRepeated(int[] a, int n) {
		
//		for(int i=0;i<n;i++) {
//			for(int j = i;j<n-1;j++) {
//				if(a[i]==a[j+1])
//					return i+1;
//			}
//		}
//		return -1;

		HashMap<Integer, Integer> hm = new HashMap<>();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int key = a[i];
			if (hm.containsKey(key) == false)
				hm.put(key, i + 1);
			else
				min = Math.min(min, hm.get(key));
		}

		return min == Integer.MAX_VALUE ? -1 : min;
	}

}
