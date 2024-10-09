package valuerange;

import java.time.LocalDateTime;
import java.time.temporal.ValueRange;

public class Creacion {

	public static void main(String[] args) {
		// create LocalDateTime
		LocalDateTime l1 = LocalDateTime.parse("2018-12-06T19:21:12");

		// Get ValueRange object
		ValueRange vR = l1.range(ChronoField.DAY_OF_MONTH);

		// apply isFixed()
		boolean response = vR.isFixed();

		// print results
		System.out.println("isFixed: " + response);
		Date dd;
	}

}
