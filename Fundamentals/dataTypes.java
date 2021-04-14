package Fundamentals;

import java.util.Scanner;

public class dataTypes {

//			Number of days = ⌊ n / (24 * 3600) ⌋
//			Number of Hours = ⌊ (n % (24 * 3600)) / 3600 ⌋
//			Number of Minutes = ⌊ (n % (24 * 3600 * 3600)) / 60 ⌋
//			Number of Seconds = ⌊ (n % (24 * 3600 * 3600 * 60)) / 60 ⌋

//			Number of years will be the quotient when number of days will be divided by 365 i.e days / 365 = years.
//			Number of weeks will be the result of (Number_of_days % 365) / 7.
//			Number of days will be the result of (Number_of_days % 365) % 7.

//	 year = number_of_days / 365; 
//     week = (number_of_days % 365) / DAYS_IN_WEEK; 
//     days = (number_of_days % 365) %  DAYS_IN_WEEK; 	

//	Metric Formula
//	BMI = (weight in kilograms) / height in meters²

//	Imperial Formula
//	BMI = (weight in pounds * 703) / height in inches²

	public static void main(String[] args) {
		double minutesInYear = 60 * 24 * 365;

		Scanner input = new Scanner(System.in);

		System.out.print("Input the number of minutes: ");

		double min = input.nextDouble();

		long years = (long) (min / minutesInYear);
		int days = (int) (min / 60 / 24) % 365;

		System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");

	}

}
