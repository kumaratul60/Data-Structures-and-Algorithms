package Fundamentals;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GregianCalender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String[] dayofweek = { "Invalid", "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
			System.out.println("enter year");
			int y = sc.nextInt();
			System.out.println("enter month");
			int m = sc.nextInt();
			System.out.println("enter day");
			int d = sc.nextInt();

			System.out.println(dayofweek[method(y, m, d)]);
		}
	}

	static int method(int year, int month, int day) {
		int[] darr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// check validity of year and month
		if (year > 0 && (month > 0 && month <= 12)) {

			// check for a leap year and month of February

			if ((year % 4 == 0 || year % 400 == 0) && month == 2 && (day > 0 && day <= 29)) {
				// month starts at zero, so we need to put ( month - 1 ).
				Calendar calendar = new GregorianCalendar(year, month - 1, day);
				return calendar.get(Calendar.DAY_OF_WEEK);
			} else {

				// check the range of day of month
				if (day > 0 && day <= darr[month - 1]) {

					// month starts at zero, so we need to put ( month - 1 ).
					Calendar calendar = new GregorianCalendar(year, month - 1, day);
					return calendar.get(Calendar.DAY_OF_WEEK);
				} else
					return 0;
			}
		} else
			return 0;

	}

}
