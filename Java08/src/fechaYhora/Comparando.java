package fechaYhora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class Comparando {

	public static void main(String[] args) {
		LocalDateTime lDate = LocalDateTime.now();
		System.out.println(lDate); // prints the date
		OffsetDateTime lDateOff = OffsetDateTime.now();
		System.out.println(lDateOff.toZonedDateTime()); // prints the date

	}
}
