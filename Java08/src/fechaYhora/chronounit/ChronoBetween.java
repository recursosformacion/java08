package fechaYhora.chronounit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoBetween {

	public static void main(String[] args) {
		LocalDate ref = LocalDate.of(1934,11,9);
		LocalDate ahora = LocalDate.now();
		long enAny =  ChronoUnit.YEARS.between(ref, ahora);
		
		System.out.println( "Carl Sagan nacio hace " + enAny + " años.");
		
	}

}
