package Arrays;

import java.util.Scanner;

public class MulArray {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      while(t-->0) {
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        int mul = 1;
	        for(int i=0;i<n;i++) {
	          arr[i] = sc.nextInt();
	          mul *= arr[i];
	        }
	          System.out.print(mul+" ");
	        
	      }
	}

}
