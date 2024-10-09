package fechaYhora.duration;

import java.time.Duration;

public class DurationTo {

	public static void main(String[] args) {
		
		Duration d1 = Duration.ofDays(1);
		
		System.out.println("En dias   :" + d1.toDays());
		System.out.println("En minutos:" + d1.toMinutes());

	}

}
