package Arrays;

import java.util.Scanner;

public class DeletionOfArray {
	public static void main(String[] args) {
		int a[] = {3,1,10,4,9,20,2,11,12,13};
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter element which want to delete : ");
		 int del_ele = sc.nextInt();
		 for(int i=0;i<a.length;i++)
		 {
			  if(del_ele==a[i])
			 {
			 for(int j=i;j<a.length-1;j++)
				 a[j] = a[j+1];
			           break;
			 }
		 }
		 for(int i : a) System.out.print(i+",");
	}

}
