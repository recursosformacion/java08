package fechaYhora.Month;

import java.time.LocalDate;
import java.time.Month;

public class MonthAdjustInto {

	public static void main(String[] args) {
		
		LocalDate undia = LocalDate.parse("2017-03-23");
		Month elMes = Month.of(9);
		System.out.println("Fecha           :" + undia);
		LocalDate otro = (LocalDate)elMes.adjustInto(undia);
		System.out.println("Fecha ajustada  :" + otro);

	}

}
