package fechaYhora;

import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MesDia {

	public static void main(String[] args) {
		
		MonthDay month = MonthDay.now(); 
		System.out.println("Salida:" + month);
		
	    ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);  
	    System.out.println(r1);  
	    ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);  
	    System.out.println(r2);  
	    
	    long n = month.get(ChronoField.MONTH_OF_YEAR);  
	    System.out.println("Ver el mes:"+ n);  
	    
	    n = month.get(ChronoField.DAY_OF_MONTH);  
	    System.out.println("Ver el dia:"+ n);  
	    
	    boolean b = month.isValidYear(2022);  
	    System.out.println("Es correcto el mes:" + b);  
	  }  

}
