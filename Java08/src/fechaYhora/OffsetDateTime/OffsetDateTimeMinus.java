package fechaYhora.OffsetDateTime;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeMinus {

	public static void main(String[] args) {
		
		OffsetDateTime date = OffsetDateTime.of(2016,3, 13,20,15,30,14725,ZoneOffset.UTC);
		date = date.minusDays(7); //resto 7 dias
		System.out.println(date); // 2016-03-06T20:15:30.000014725Z
		
		date = date.minusMonths(2); //resto 2 meses
		System.out.println(date); // 2016-01-06T20:15:30.000014725Z
		
		date = date.minus(100,ChronoUnit.DAYS); //resto 100 dias
		System.out.println(date); // 2015-09-28T20:15:30.000014725Z
		
		date = date.minusHours(2); //resto 2 horas
		System.out.println(date); // 2015-09-28T18:15:30.000014725Z
		
		
		
	}

}
