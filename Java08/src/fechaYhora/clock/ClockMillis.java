package fechaYhora.clock;

import java.time.Clock;

public class ClockMillis {

	public static void main(String[] args) {
		Clock clock = Clock.systemDefaultZone();
		System.out.println(clock.millis());
	}

}
