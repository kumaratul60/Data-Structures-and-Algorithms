package Dates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Find_Date_between_2 {

	// To calculate the days between two dates we can use
	// the DAYS. between() method of java. time. temporal.

	// long noOfDaysBetween = DAYS.between(startDate, endDate);
	// or alternatively
	// long noOfDaysBetween = startDate.until(endDate, DAYS);

	public static void main(String[] args) {

		// M2
		/*
		 * // 24-May-2017, change this to your desired Start Date LocalDate dateBefore =
		 * LocalDate.of(2017, Month.MAY, 24); // 29-July-2017, change this to your
		 * desired End Date LocalDate dateAfter = LocalDate.of(2017, Month.JULY, 29);
		 * long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		 * System.out.println(noOfDaysBetween);
		 * 
		 */

		// M3
		String dateBeforeString = "2017-05-24";
		String dateAfterString = "2017-07-29";

		// Parsing the date
		LocalDate dateBefore = LocalDate.parse(dateBeforeString);
		LocalDate dateAfter = LocalDate.parse(dateAfterString);

		// calculating number of days in between
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

		// displaying the number of days
		System.out.println(noOfDaysBetween);

	}

}
