package fechaYhora.Month;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoField;

public class MonthLength {

	public static void main(String[] args) {
		Year dato = Year.of(2020);
		Month mes = Month.of(2);
		
		System.out.println("Longitud minima  : " 
				+  mes.minLength());
		System.out.println("Longitud maxima  : " 
				+  mes.maxLength());
		System.out.println("Longitud exacta  : " 
				+  mes.length(dato.isLeap()));

	}

}
