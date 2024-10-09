package fechaYhora.OffsetTime;

import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.Month;

public class OffsetTimeIs {

public static void main(String[] args) {
	
	OffsetTime d1 = OffsetTime.of(10, 45,30,14725,ZoneOffset.UTC);
	System.out.println("d1                : " + d1);
	
	OffsetTime d2 = OffsetTime.of(20, 45,30,14725,ZoneOffset.UTC);
	System.out.println("d2                : " + d2);

	System.out.println("d1 posterior a d2 : " + d1.isAfter(d2));
	System.out.println("d2 anterior  a d1 : " + d2.isBefore(d1));
	System.out.println("d1 igual  a d2    : " + d1.equals(d2));
	System.out.println("d1 compareto  d2  : " + d1.compareTo(d2));

}

}
