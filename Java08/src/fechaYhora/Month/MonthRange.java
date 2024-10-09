package fechaYhora.Month;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoField;

public class MonthRange {

	public static void main(String[] args) {
		Month mes = Month.of(2);
		
		System.out.println("Range            : " 
				+  mes.range(ChronoField.MONTH_OF_YEAR));

	}

}
