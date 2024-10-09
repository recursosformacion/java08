package fechaYhora.instant;

import java.time.Instant;

public class InstantCompareTo {

	public static void main(String[] args) {
		Instant i1 = Instant.parse("2022-11-20T16:55:30.00Z");
		Instant i2 = Instant.now();

		System.out.println("Instant1: " + i1);
		System.out.println("Instant2: " + i2);
		
		// compara equal y presenta
		int value = i1.compareTo(i2);
		System.out.println("la comparacion da ?: " + value);

	}

}
