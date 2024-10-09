package fechaYhora;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.time.temporal.ValueRange;

public class Rango {

	public static void main(String[] args) {
		{
			  
	        // create a LocalDate object
	        LocalDate localD
	            = LocalDate.parse("2018-12-06");
	  
	        // print LocalDate
	        System.out.println("LocalDate: "
	                           + localD);
	  
	        // get range of Days field
	        // from LocalDate using range method
	        ValueRange range
	            = localD.range(ChronoField.DAY_OF_MONTH);
	  
	        // print range of DAY_OF_MONTH
	        System.out.println("Range of DAY_OF_MONTH: "
	                           + range);
	        //ChronoField.DAY_OF_MONTH para mejorar mensaje de error, si no, null
	        System.out.println("CheckInt: " + range.checkValidIntValue(30, ChronoField.DAY_OF_MONTH));
	        System.out.println("Dia del año: " + localD.get(ChronoField.DAY_OF_YEAR));
	        
	        
	        //rango multiple
	        ValueRange rangoM = ValueRange.of(1, 10,1000,9999);
	    }

	}

}
