package fechaYhora.LocalTime;

import java.time.LocalTime;
import java.time.Month;

public class LocalTimeIs {

	public static void main(String[] args) {
		
		LocalTime d1 = LocalTime.of(15,30,48);
		System.out.println("d1                : " + d1);
		
		LocalTime d2 = LocalTime.of(8,10);
		System.out.println("d2                : " + d2);
	
		System.out.println("d1 posterior a d2 : " + d1.isAfter(d2));
		System.out.println("d2 anterior  a d1 : " + d2.isAfter(d1));
		System.out.println("d1 igual  a d2    : " + d1.equals(d2));
		System.out.println("d1 compareto  d2  : " + d1.compareTo(d2));

	}

}
