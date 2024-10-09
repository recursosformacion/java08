package fechaYhora;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;

public class MesesEnCastellano {

	public static void main(String[] args) {
		// making the object of the DateFormatSymbols class
		DateFormatSymbols dateFormatSymbolsobject = new DateFormatSymbols();

		// calling the method of the DateFormatSymbols class
		String[] shortFormatMonthsNames = dateFormatSymbolsobject.getShortMonths();

		for (int i = 0; i < (shortFormatMonthsNames.length - 1); i++) {

			// getting the month name from particular index
			String shortMonthName = shortFormatMonthsNames[i];

			System.out.println("Name of Month In Shorter Format " + shortMonthName);
		}
	}

}
