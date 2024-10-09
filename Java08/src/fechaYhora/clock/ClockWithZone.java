package fechaYhora.clock;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class ClockWithZone {

	public static void main(String[] args) {
		ZoneId zoneMX = ZoneId.of("Mexico/General");  
		Clock cMX = Clock.system(zoneMX); 
		System.out.println(LocalTime.now(cMX));

		ZoneId zoneBr = ZoneId.of("Europe/Brussels");
		Clock cBr = cMX.withZone(zoneBr);
		System.out.println(LocalTime.now(cBr));

	}

}
