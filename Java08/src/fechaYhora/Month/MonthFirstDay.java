package fechaYhora.Month;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class MonthFirstDay {

	public static void main(String[] args) {
		
		
		Month elMes = Month.of(2);
		System.out.println("Dia del año   :" + elMes.firstDayOfYear(Year.isLeap(2016)));
		

	}

}
