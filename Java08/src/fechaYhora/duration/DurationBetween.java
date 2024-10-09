package fechaYhora.duration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationBetween {

	public static void main(String[] args) {
		
		LocalTime ini = LocalTime.MIN;
		LocalTime now = LocalTime.now();
		
		Duration d1 = Duration.between(ini, now);
		System.out.println(d1);
	}

}
