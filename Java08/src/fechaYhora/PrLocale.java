package fechaYhora;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class PrLocale {

	public static void main(String[] args) {
		
		System.out.printf("default zone offset==[%s]\n",
	            ZoneId.systemDefault());
	    System.out.printf("1st day of week==%s\n",
	            WeekFields.of(Locale.getDefault()).getFirstDayOfWeek());
	    
	    LocalDate localDate = LocalDate.now();
	    System.out.printf("localDate == %s \n", localDate);
	    System.out.printf("localdate first day of week == %s (%s) \n",
	            localDate.with(ChronoField.DAY_OF_WEEK, 1),
	            localDate.with(ChronoField.DAY_OF_WEEK, 1).getDayOfWeek());

	    TemporalField myWeek = WeekFields.of(DayOfWeek.SUNDAY, 1).dayOfWeek();
	    System.out.printf("configured localdate first day of week == %s (%s) \n",
	            localDate.with(myWeek, 1),
	            localDate.with(myWeek, 1).getDayOfWeek());
	    
	    ZoneId lc = ZoneId.of("America/Los_Angeles");
	    LocalDateTime localDate2 = LocalDateTime.now(lc);
	    System.out.printf("LA date == %s \n", localDate2);
	    System.out.printf("LA date first day of week == %s (%s) \n",
	            localDate2.with(ChronoField.DAY_OF_WEEK, 1),
	            localDate2.with(ChronoField.DAY_OF_WEEK, 1).getDayOfWeek());

	}

}
