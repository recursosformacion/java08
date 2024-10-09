package fechaYhora.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class LocalDateTimeatTime {

	public static void main(String[] args) {
		  LocalDateTime ahora = LocalDateTime.now();
		  
		  System.out.println("ahora      : " + ahora); 
	      ZonedDateTime ahoraC = ahora.atZone(ZoneId.of("America/Mexico_City"));
	      System.out.println("ahoraC     : " + ahoraC); 
	      
	      OffsetDateTime otro = ahora.atOffset(ZoneOffset.ofHours(2));
	      System.out.println("Offset +2  : " + otro);  


	}

}
