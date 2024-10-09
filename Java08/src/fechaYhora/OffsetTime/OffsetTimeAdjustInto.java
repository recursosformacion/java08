package fechaYhora.OffsetTime;


import java.time.OffsetTime;
import java.time.Year;
import java.time.ZonedDateTime;

public class OffsetTimeAdjustInto {

public static void main(String[] args) {

	ZonedDateTime date = ZonedDateTime.now();
	System.out.println(date);

	OffsetTime date1 = OffsetTime.parse("14:37:00+02:00");
	date = (ZonedDateTime) date1.adjustInto(date);
	System.out.println(date);

}

}
