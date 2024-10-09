package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZonedDateTime;

public class LocalDateatTime {

	public static void main(String[] args) {
		  LocalDate hoy = LocalDate.now();
		  System.out.println("hoy                : " + hoy); 
	      LocalDateTime ahora = hoy.atStartOfDay();
	      System.out.println("at StartOfDay      : " + ahora); 
	      
	      LocalDateTime despues = hoy.atTime(14,20);
	      System.out.println("at 14:20           : " + despues);  


	}

}
