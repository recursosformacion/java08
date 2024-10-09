package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.Month;

public class YearMonthPlus {

public static void main(String[] args) {
	
	YearMonth ames = YearMonth.of(2018, Month.DECEMBER);

	ames = ames.plusMonths(1);
	System.out.println(ames); // presenta 2019-01

	ames = ames.plusYears(1); // duma un año
	System.out.println(ames); // 2020-01

}

}
