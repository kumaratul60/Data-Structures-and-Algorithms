package Arrays;

import java.util.Scanner;

public class Array1d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int arr[];// declarinring an Array
//		arr = new int[n]; // initialising an Array
		
		int[] arr = new int[n]; //combinning both statement in one
		
		for(int i=0;i<arr.length;i++)
			System.out.println(i);
	}

}
