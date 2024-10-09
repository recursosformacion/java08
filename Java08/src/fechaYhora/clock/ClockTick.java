package fechaYhora.clock;

import java.time.Clock;
import java.time.Duration;

public class ClockTick {

	public static void main(String[] args) {
		Clock cdz = Clock.systemDefaultZone();
		Clock d30tick = Clock.tick(cdz, Duration.ofSeconds(30));
		Clock d20tick = Clock.tick(cdz, Duration.ofMinutes(20));

		System.out.println("Clock          : " + cdz.instant());
		System.out.println("Redondeo 30 sec: " + d30tick.instant());
		System.out.println("Redondeo 20 m. : " + d20tick.instant());

	}

}
