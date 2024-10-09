package fechaYhora.OffsetDateTime;


import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeIsAfter {

	public static void main(String[] args) {

		OffsetDateTime d1 = OffsetDateTime
				.of(2022, 8, 13, 10, 22,0,0,ZoneOffset.ofHours(-2));
		OffsetDateTime d2 = OffsetDateTime
				.of(2022, 3, 13, 15, 32,0,0,ZoneOffset.ofHours(-2));

		System.out.println("d1               :" + d1);
		System.out.println("d2               :" + d2);
		System.out.println("d1.isAfter(d2 )  :" + d1.isAfter(d2));	

	}

}
