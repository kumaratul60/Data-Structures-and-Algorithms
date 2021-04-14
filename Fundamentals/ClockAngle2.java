package Fundamentals;

import java.util.Scanner;

public class ClockAngle2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t-->0) {
			 int angle = 0;
	         
	        int h = sc.nextInt();
	        int m = sc.nextInt();
	        int hr = h*(360/12)+(m*360)/(12*60);
	        int mm = (m*360)/60;
	        if(hr>mm)
	        angle = hr-mm;
	        else
	        angle = mm-hr;
	        System.out.println(angle); 
	      }
	      t--;
	}
	
}
