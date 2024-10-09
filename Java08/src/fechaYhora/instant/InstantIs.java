package fechaYhora.instant;

import java.time.Instant;

public class InstantIs {

	public static void main(String[] args) {
		Instant i1 = Instant.parse("2022-11-20T16:55:30.00Z");
		Instant i2 = Instant.parse("2022-11-20T16:55:30.00Z");
		Instant i3 = Instant.now();

		System.out.println("Instant1: " + i1);
		System.out.println("Instant2: " + i2);
		System.out.println("Instant3: " + i3);

		// compara equal y presenta
		boolean value = i1.equals(i2);
		System.out.println("Son iguales i1 e i2?: " + value);
		
		boolean antes = i1.isAfter(i3);
		System.out.println("es i1 anterior a i3?: " + antes);
		

	}

}
