package Fundamentals;

import java.util.Scanner;

public class clockAngle3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			
			//double hr = ((h * 60) + m) * 0.5;
			//double hr = h*(360/12)+(m*360)/(12*60);
			//double mm = (m*360)/60;
			
			double hr =  h*(30)+(m*.5);
			double mm = m * 6;
			double angle = abs(hr - mm);
			if (angle < 360 ) {
				System.out.println((int) angle);
			} else {
				System.out.println(360 - (int) angle);
			}
		}
	}

	private static double abs(double d) {
		if (d > 0) {
			return d;
		} else {
			return  d*-1;
		}
	}
}
