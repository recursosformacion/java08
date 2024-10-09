package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateGet {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		
		System.out.println("Fecha           :" + 
				hoy.toString());
		System.out.println("Dia mes         :" + 
				hoy.getDayOfMonth());	
		System.out.println("Numero mes      :" + 
				hoy.getMonthValue());	
		System.out.println("Año             :" + 
				hoy.getYear());
		System.out.println("Dia Año         :" + 
				hoy.getDayOfYear());

		System.out.println("Dia semana Obj  :" + 
				hoy.getDayOfWeek());	
		System.out.println("Mes        Obj  :" + 
				hoy.getMonth());
		
		System.out.println("----------------------------------------");
		System.out.println("Dia   cualquiera int  :" + 
				hoy.get(ChronoField.DAY_OF_MONTH));
		System.out.println("ERA   cualquiera Long :" + 
				hoy.getLong(ChronoField.ERA));
		System.out.println("EPOCH cualquiera Long :" + 
				hoy.getLong(ChronoField.EPOCH_DAY));
		System.out.println("----------------------------------------");
		System.out.println("Era                   :" + 
				hoy.getEra());		
		System.out.println("Calendario            :" + 
				hoy.getChronology());

	}

}
