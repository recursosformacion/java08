package fechaYhora.duration;

import java.time.Duration;

public class DurationDM {

	public static void main(String[] args) {
		
		Duration base = Duration.ofHours(12);
		Duration mitad = base.dividedBy(2);
		Duration doble = base.multipliedBy(2);
		
		System.out.println("Base :" + base);
		System.out.println("Mitad:" + mitad);
		System.out.println("Doble:" + doble);
	}

}
