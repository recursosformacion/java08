package fechaYhora.LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class LocalTimeatTime {

	public static void main(String[] args) {
		  LocalTime ahora = LocalTime.now();
		  LocalDate unDia = LocalDate.of(2022, 9,15);
		  System.out.println("ahora      : " + ahora); 
	      LocalDateTime ahoraC = ahora.atDate(unDia);
	      System.out.println("ahoraC     : " + ahoraC); 
	      
	      OffsetTime otro = ahora.atOffset(ZoneOffset.ofHours(2));
	      System.out.println("Offset +2  : " + otro);  


	}

}
