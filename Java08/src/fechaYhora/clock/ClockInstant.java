package fechaYhora.clock;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ClockInstant {

	public static void main(String[] args) {
		
		Clock def = Clock.systemDefaultZone();
				
		System.out.println("Default:" + LocalDateTime.now(def));
		System.out.println("instant:" + def.instant());
	}

}
