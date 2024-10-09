package fechaYhora;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class PrimeroYUltimoDia {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
        System.out.println("Input Date: "+ now);
        System.out.println(getFirstAndLastDayOfTheWeek(now));

        LocalDate localDate = LocalDate.of(2022,01,01);
        System.out.println("Input Date: "+ localDate);
        System.out.println(getFirstAndLastDayOfTheWeek(localDate));

	}

	public static String getFirstAndLastDayOfTheWeek(LocalDate date) {

        Locale localizacion = Locale.getDefault();
        WeekFields weekFields = WeekFields.of(localizacion);
        DayOfWeek firstDayOfTheWeek = weekFields.getFirstDayOfWeek();
        DayOfWeek lastDayOfTheWeek = firstDayOfTheWeek.minus(1);

        LocalDate firstDate = date.with(TemporalAdjusters.previousOrSame(firstDayOfTheWeek));
        LocalDate lastDate = date.with(TemporalAdjusters.nextOrSame(lastDayOfTheWeek));
        return firstDate +" - " + lastDate;
    }
	
}
