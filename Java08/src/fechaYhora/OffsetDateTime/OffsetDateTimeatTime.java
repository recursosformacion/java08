package fechaYhora.OffsetDateTime;

import java.time.OffsetTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class OffsetDateTimeatTime {

	public static void main(String[] args) {
		  OffsetDateTime ahora = OffsetDateTime.now();
		  
		  System.out.println("ahora      : " + ahora); 
	      ZonedDateTime ahoraC = ahora.atZoneSameInstant(ZoneId.of("America/Mexico_City"));
	      System.out.println("ahoraC     : " + ahoraC); 
	      
	      ZonedDateTime otro = ahora.atZoneSimilarLocal(ZoneOffset.ofHours(2));
	      System.out.println("Offset +2  : " + otro);  
	}

}
