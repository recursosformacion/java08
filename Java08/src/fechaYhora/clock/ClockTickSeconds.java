package fechaYhora.clock;

import java.time.Clock;
import java.time.ZoneId;

public class ClockTickSeconds {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("America/Mexico_City");
		Clock clock = Clock.tickSeconds(zoneId);
		System.out.println(clock.instant());

	}

}