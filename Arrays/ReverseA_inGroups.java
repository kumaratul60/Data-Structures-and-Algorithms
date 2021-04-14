package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseA_inGroups {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		new ReverseA_inGroups();
		 ReverseA_inGroups.reverseGroup(a, n, k);
		ReverseA_inGroups.print(a, n);
	}

	static void reverseGroup(int a[], int n, int k) {
		// public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {

		for (int i = 0; i < n; i += k) {
			int left = i;
			int right = Math.min(i + k - 1, n - 1);

			while (left < right) {

				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;

			}
		}
	}

	static void print(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
	
	//////////////////////////////////*************************///////////////////////
	  static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
	        for(int i=0;i<n;i++) {
	                reverseArr(mv,i,i+k-1,n);
	        }
	        return mv;
	    }
	    static void reverseArr(ArrayList<Integer> mv,int start,int end,int n) {
	        if(end>=start)
	        end = n-1;
	        while(start<end) {
	            int temp = mv.get(start);
	            int evalue = mv.get(end);
	            mv.set(start,evalue);
	            mv.set(end,temp);
	            start++;
	            end--;
	        }
	    }

}
