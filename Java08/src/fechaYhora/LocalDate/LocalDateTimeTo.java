package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeTo {

	public static void main(String[] args) {
		LocalDateTime hoy = LocalDateTime.now();
		
		System.out.println("LocalDate       :" + 
				hoy.toLocalDate());
		
		System.out.println("LocalTime       :" + 
				hoy.toLocalTime());		

	}

}
