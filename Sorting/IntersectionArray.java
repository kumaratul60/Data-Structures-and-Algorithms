package Sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int m = sc.nextInt();
			int b[] = new int[m];
			for (int i = 0; i < m; i++)
				b[i] = sc.nextInt();
			new IntersectionArray();
			// IntersectionArray.interSection1(a, b, m, n);
			System.out.println(IntersectionArray.printIntersection(a, b, m, n));

		}
	}

	static void interSection(int a[], int b[], int m, int n) {
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (i > 0 && a[i - 1] == a[i]) {
				i++;
				continue;
			}
			if (a[i] < b[i])
				i++;
			else if (a[i] > b[i])
				j++;
			else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
	}

	static void interSection1(int a[], int b[], int m, int n) {
		int i = 0, j = 0;
		while (i < n && j < m) {

			if (a[i] < b[j])
				i++;
			else if (a[i] > b[j])
				j++;
			else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
	}

	static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        int i = 0, j = 0;
        boolean flag=false;
        
        ArrayList<Integer> sb = new ArrayList<Integer>();
        
        while (i < n && j < m)
        {
            if (i > 0 && arr1[i-1] == arr1[i])
            {
                i++;
                continue;
            }
            if (arr1[i] < arr2[j])
               i++;
            else if (arr2[j] < arr1[i])
               j++;
            else
            {
               sb.add(arr2[j]);
               flag=true;
               i++; j++;
            }
        }
        
        if(flag==false)
            sb.add(-1);
        return sb;
    }
}
