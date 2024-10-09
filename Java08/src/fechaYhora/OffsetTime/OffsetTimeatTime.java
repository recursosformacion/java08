package fechaYhora.OffsetTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class OffsetTimeatTime {

public static void main(String[] args) {
	  OffsetTime ahora = OffsetTime.now();
	  LocalDate unDia = LocalDate.of(2022, 9,15);
	  System.out.println("ahora      : " + ahora); 
      OffsetDateTime ahoraC = ahora.atDate(unDia);
      System.out.println("ahoraC     : " + ahoraC); 
}

}
