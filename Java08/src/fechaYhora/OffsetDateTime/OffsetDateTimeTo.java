package fechaYhora.OffsetDateTime;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeTo {

	public static void main(String[] args) {

		OffsetDateTime d1 = 
				OffsetDateTime.of(2022, 10, 13, 10, 22,0,0,ZoneOffset.MAX);
		System.out.println("toEpochSecond   :" + d1.toEpochSecond());
		System.out.println("toString        :" + d1.toString());
		System.out.println("toInstant       :" + d1.toInstant());
		System.out.println("toLocalDate     :" + d1.toLocalDate());
		System.out.println("toLocalDateTime :" + d1.toLocalDateTime());
		System.out.println("toLocalTime     :" + d1.toLocalTime());
		System.out.println("toOffsetTime    :" + d1.toOffsetTime());
		System.out.println("toZonedDateTime :" + d1.toZonedDateTime());
		

	}

}
