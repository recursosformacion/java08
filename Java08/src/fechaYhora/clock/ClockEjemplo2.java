package fechaYhora.clock;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ClockEjemplo2 {

	public static void main(String[] args) {
		
		Clock clock = Clock.systemDefaultZone();
		System.out.println("Clock Default Zone:" + clock);
		System.out.println("Clock Instant:" + clock.instant());
		System.out.println("Clock LocalDateTime:" + LocalDateTime.now());

	}

}
