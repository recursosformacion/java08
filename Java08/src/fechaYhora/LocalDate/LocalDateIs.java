package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateIs {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2022, Month.AUGUST, 13);
		System.out.println("d1               :" + d1);
		System.out.println("d1 es bisiesto?  :" + d1.isLeapYear());
		
		LocalDate d2 = LocalDate.of(2024, Month.APRIL, 13);
		System.out.println("d2               :" + d2);
		System.out.println("d2 es bisiesto?  :" + d2.isLeapYear());
	

	}

}
