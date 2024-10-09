package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.Month;

public class YearMonthMinus {

public static void main(String[] args) {
	
	YearMonth ames = YearMonth.of(2018, Month.DECEMBER);

	ames = ames.minusMonths(1);
	System.out.println(ames); // presenta 2018-11

	ames = ames.minusYears(1); // duma un año
	System.out.println(ames); // 2017-11

}

}
