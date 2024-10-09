package fechaYhora.clock;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeEj {

	public static void main(String[] args) {
		Clock cMX = Clock.system(ZoneId.of("Mexico/General"));
		Instant now = Instant.now();
		ZonedDateTime zdt = ZonedDateTime.ofInstant(now,
                ZoneId.systemDefault());
        System.out.println( "Date is: " + zdt );
        
        System.out.println("Mexico: " + ZonedDateTime.ofInstant(cMX.instant(),ZoneId.of("Mexico/General")));
        System.out.println("**************************************************");

	}

}
