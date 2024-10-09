package fechaYhora.clock;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class ClockFixed {

	public static void main(String[] args) {
		 // Crea la clase instante
        Instant instant = Instant.parse("2022-09-20T10:05:33.00Z");
  
        // Crea ZoneId para para  Europe/Luxembourg
        ZoneId zoneId = ZoneId.of("Europe/Luxembourg");
  
        // Obtener Clock
        Clock clock = Clock.fixed(instant, zoneId);
  
        // print details of clock
        System.out.println(clock.toString()); //-->FixedClock[2022-09-20T10:05:33Z,Europe/Luxembourg]
        System.out.println(clock.instant());  //-->2022-09-20T10:05:33Z
	}

}
