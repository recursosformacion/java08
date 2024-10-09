package fechaYhora.year;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class YearAt {

public static void main(String[] args) {
	Year d1 = Year.of(2022);
	System.out.println("d1             : " + d1);
	
	LocalDate f1 = d1.atDay(244);
	System.out.println("con dia año    : " + f1);
	
	YearMonth ym1 = d1.atMonth(9);
	YearMonth ym2 = d1.atMonth(Month.OCTOBER);
	System.out.println("con mes 9      : " + ym1);
	System.out.println("con mes OCTOBER: " + ym2);
	
	MonthDay md = MonthDay.of(12,25);
	LocalDate f2 = d1.atMonthDay(md);
	System.out.println("con MonthDay   : " + f2);
}

}
