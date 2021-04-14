package Arrays;

import java.util.Scanner;

public class MejorityWins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		new MejorityWins();
		System.out.println(MejorityWins.majorityWins(arr, n, x, y));

	}

	static int majorityWins(int arr[], int n, int x, int y) {
		int count_x = 0;// counter to count frequency of x
		int count_y = 0;// counter to count frequency of y

		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				count_x++;
			else if (arr[i] == y)
				count_y++;
		}
		if (count_x == count_y) {
			if (x > y)
				return y;
			else
				return x;
		} else if (count_x > count_y) {
			return x;
		} else {
			return y;
		}
	}

}
