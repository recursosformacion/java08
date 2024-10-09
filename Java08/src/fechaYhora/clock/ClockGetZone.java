package fechaYhora.clock;

import java.time.Clock;
import java.time.ZoneId;

public class ClockGetZone {

	public static void main(String[] args) {
		Clock cMX = Clock.system(ZoneId.of("Mexico/General"));
		Clock def = Clock.systemDefaultZone();
		Clock utc = Clock.systemUTC();
		
		System.out.println(cMX.getZone());
		System.out.println(def.getZone());
		System.out.println(utc.getZone());

	}

}
