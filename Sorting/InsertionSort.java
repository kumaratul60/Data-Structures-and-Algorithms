package Sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int []a = {7,1,4,8,9,6,2};
		for(int i=1;i<a.length;i++) {
			int temp = a[i];
			int j = i;
			while(j>0 && a[j-1]>temp) {
				a[j] = a[j-1];
				j = j-1;
				}
		}
		//for(int i : a) System.out.print(i+",");
		for(int i=1;i<a.length;i++) 
			System.out.print(i+",");


	}

}
