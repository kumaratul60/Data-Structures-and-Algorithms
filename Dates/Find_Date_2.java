package Dates;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Find_Date_2 {

	public static void main(String[] args) throws IOException {

		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		String dateBeforeString = "20 08 1997";
		String dateAfterString = "20 08 2021";

		try {
			Date dateBefore = myFormat.parse(dateBeforeString);
			Date dateAfter = myFormat.parse(dateAfterString);
			long difference = dateAfter.getTime() - dateBefore.getTime();
			float daysBetween = (difference / (1000 * 60 * 60 * 24));
			/*
			 * You can also convert the milliseconds to days using this method float
			 * daysBetween = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
			 */
			System.out.println("Number of Days between dates: " + daysBetween);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
