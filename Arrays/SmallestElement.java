package Arrays;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) 
			a[i] = sc.nextInt(); 
		int index = 0;
		int min = a[0];
		int sum = 0;
		int lastdigitSum = 0;
		//int min = a[index];
		for(int i=0;i<n;i++) {
			sum += a[i];
			lastdigitSum = sum%10;
			if(a[i] <= min) {
				min = a[i];
				index = i;
			}
		}
		
		System.out.println("smallest element index:" + index);
		System.out.println("smallest element:" + min);
		System.out.println(sum);
		System.out.println(lastdigitSum);
		System.out.println(index+min+sum+lastdigitSum);
		
	}

}
