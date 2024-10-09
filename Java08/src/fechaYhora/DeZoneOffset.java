package fechaYhora;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

//https://www.w3schools.blog/java-8-zoneoffset-class
public class DeZoneOffset {

	public static void main(String[] args) {

		System.out.println("Actual:"+ZonedDateTime.now());
		ZoneOffset zone1 = ZoneOffset.UTC;
		System.out.println("UTC:"+ zone1);
		Temporal temp = zone1.adjustInto(ZonedDateTime.now());
		System.out.println("Temp:" + temp);

		// ofHours() method
		ZoneOffset zone2 = ZoneOffset.ofHours(5);
		System.out.println("+5horas" + zone2);

		// ofHoursMinutes() method
		ZoneOffset zone3 = ZoneOffset.ofHoursMinutes(5, 30);
		System.out.println("+5:30:"+zone3);

	}

}
