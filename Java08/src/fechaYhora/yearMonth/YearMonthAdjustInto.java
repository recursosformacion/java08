package fechaYhora.yearMonth;

import java.time.YearMonth;
import java.time.Year;
import java.time.ZonedDateTime;

public class YearMonthAdjustInto {

public static void main(String[] args) {
	
	ZonedDateTime date = ZonedDateTime.now();
      System.out.println(date);  

      YearMonth date1 = YearMonth.parse("2017-02");
      date = (ZonedDateTime)date1.adjustInto(date);
      System.out.println(date);  

}

}
