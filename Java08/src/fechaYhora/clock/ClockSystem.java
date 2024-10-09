package fechaYhora.clock;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ClockSystem {

	public static void main(String[] args) {
		Clock cMX = Clock.system(ZoneId.of("Mexico/General"));
		Clock def = Clock.systemDefaultZone();
		Clock utc = Clock.systemUTC();
		
		System.out.println("Mexico: " + LocalTime.now(cMX));		
		System.out.println("Default:" + LocalTime.now(def));
		System.out.println("UTC    :" + LocalTime.now(utc));
	}

}
