package fechaYhora.Month;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class MonthCreate {

	public static void main(String[] args) {
		
		Month febrero = Month.of(2);
		System.out.println("febrero   : " + febrero);
		
		LocalDate undia = LocalDate.parse("2017-03-23");
		Month nose = Month.from(undia);
		System.out.println("nose      : " + nose);
		
		Month deVal = Month.valueOf("JUNE");
		System.out.println("deVal     : " + deVal);
		
		Month[] todos = Month.values();
		System.out.println("Lista........");
		Arrays.stream(todos).forEach(System.out::println);
		
	}

}
