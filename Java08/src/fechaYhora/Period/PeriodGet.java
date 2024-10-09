package fechaYhora.Period;

import java.time.Period;

public class PeriodGet {

public static void main(String[] args) {
	Period per1 = Period.of(5,3,0);
	System.out.println("Period.of         : " + per1);

	int dd = per1.getDays();
	System.out.println("Dias    :" + dd);
	
	int mm = per1.getMonths();
	System.out.println("Meses   :" + mm);
	
	int yy = per1.getYears();
	System.out.println("Años    :" + yy);
	
	System.out.println("Chronology   :" + per1.getChronology());
	System.out.println("TemporalUnits:" + per1.getUnits());
}
}
