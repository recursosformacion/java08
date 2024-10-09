package fechaYhora.MonthDay;

import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class MonthDayToStringjava {

	public static void main(String[] args) {
		MonthDay hoy = MonthDay.now();
		
		System.out.println("mes/dia          :" + 
				hoy.toString());
		
		
		
	}

}
