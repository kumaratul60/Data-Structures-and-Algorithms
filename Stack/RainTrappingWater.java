package Stack;

import java.util.ArrayList;

public class RainTrappingWater {

	public static void main(String[] args) {

		int n = 6;
		int a[] = new int[] { 2,3,3,2,3,1 };
		
		
		

		System.out.println(rtw(a, n));

	}

	static int rtw(int a[], int n) {
		
        if(n==0) return 0;   // leetcode condition


		int maxL[] = new int[n];
		int maxR[] = new int[n];

		maxL[0] = a[0];
		for (int i = 1; i < n; i++)
			maxL[i] = Math.max(maxL[i - 1], a[i]);

		maxR[n - 1] = a[n - 1];
		for (int i = n - 2; i >= 0; i--)
			maxR[i] = Math.max(maxR[i + 1], a[i]);

		int water[] = new int[n];
		for (int i = 0; i < n; i++)
			water[i] = (Math.min(maxL[i], maxR[i]) - a[i]);

		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += water[i];

		return sum;
	}

}
