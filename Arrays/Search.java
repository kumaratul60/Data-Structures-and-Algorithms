package Arrays;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
			a[i] = sc.nextInt();
		int x = sc.nextInt();
		Search sr = new Search();
		System.out.println(sr.search(a, n, x));
	}
	int search(int a[],int p,int x) {
		for(int i=0;i<p;i++)
			if(a[i]==x)
				return i;
		return -1;
	}

}
