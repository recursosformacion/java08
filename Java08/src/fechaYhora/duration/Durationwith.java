package fechaYhora.duration;

import java.time.Duration;

public class Durationwith {

	public static void main(String[] args) {
		
		Duration d1 = Duration.ofDays(1);
		d1 = d1.withSeconds(30);
		
		System.out.println("En dias    :" + d1.toDays());
		System.out.println("En minutos :" + d1.toMinutes());
		System.out.println("En Segundos:" + d1.toMillis()/1000);

	}

}
