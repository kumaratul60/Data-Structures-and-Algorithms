package Mathmetics;

import java.util.Scanner;

public class OddOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				
			}
			getOddOccurrence(a,n);
		}
	}
	 static int getOddOccurrence(int arr[], int arr_size) 
	    { 
	        int i; 
	        for (i = 0; i < arr_size; i++) { 
	            int count = 0; 
	            for (int j = 0; j < arr_size; j++) { 
	                if (arr[i] == arr[j]) 
	                    count++; 
	            } 
	            if (count % 2 != 0) 
	                return arr[i]; 
	        } 
	        return -1; 
	    } 

}
