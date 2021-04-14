package Arrays;

import java.util.Scanner;

public class Majority_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		Majority_Element me = new Majority_Element();
		System.out.println(me.findMajority(arr, n));
	}
	
	int findMajority(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int count = 1;
			for(int j = i+1;j<n;j++)
				if(arr[i] == arr[j]) count++;
			if(count>n/2)
				return i;
		}
		return -1;
	}

}
