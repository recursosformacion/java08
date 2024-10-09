package fechaYhora.LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateLength {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		
		System.out.println("Fecha           :" + 
				hoy.toString());
		
		System.out.println("Longitud mes          :" + 
				hoy.lengthOfMonth());
		System.out.println("Longitud año          :" + 
				hoy.lengthOfYear());	
		

	}

}
