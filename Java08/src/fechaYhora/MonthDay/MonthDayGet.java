package fechaYhora.MonthDay;

import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class MonthDayGet {

	public static void main(String[] args) {
		MonthDay hoy = MonthDay.now();
		
		System.out.println("Fecha           :" + 
				hoy.toString());
		System.out.println("Dia mes         :" + 
				hoy.getDayOfMonth());	
		System.out.println("Numero mes      :" + 
				hoy.getMonthValue());	
		
		System.out.println("Mes        Obj  :" + 
				hoy.getMonth());
		
		System.out.println("----------------------------------------");
		System.out.println("Dia   cualquiera int  :" + 
				hoy.get(ChronoField.DAY_OF_MONTH));
		System.out.println("----------------------------------------");
		

	}

}
