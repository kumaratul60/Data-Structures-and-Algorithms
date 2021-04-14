package Arrays;

import java.util.Scanner;

public class AvgArray {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
	   int[] a = {5,5};
	 	   
	  int sum = 0;
	  int avg =0;
	 for(int num:a)
	  
		   sum+=num;
	  
	 avg =sum/a.length;
	System.out.println(sum);
	System.out.println(avg);

	   }
	
	}


