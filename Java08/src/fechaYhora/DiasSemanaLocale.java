package fechaYhora;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class DiasSemanaLocale {

	public static void main(String[] args) {
		// Initializing a DayOfWeek instance
		DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

		// Get textual representation of the
		// day-of-week in FULL style
		String full_name = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

		// Get textual representation of the
		// day-of-week in SHORT style
		String short_name = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault());

		// Get textual representation of the
		// day-of-week in NARROW style
		String narrow_name = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.getDefault());

		// Printing the textual names of the day-of-week
		System.out.println(full_name);

		System.out.println(short_name);

		System.out.println(narrow_name);

	}

}
