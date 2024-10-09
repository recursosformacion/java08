package fechaYhora.Month;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class MonthFirstMonth {

	public static void main(String[] args) {
			
		Month elMes = Month.of(6);
		System.out.println("Inicio trimestre de Junio    :" + 
				elMes.firstMonthOfQuarter());		

		Month elMes2 = Month.of(11);
		System.out.println("Inicio trimestre de Noviembre:" + 
				elMes2.firstMonthOfQuarter());	
	}

}
