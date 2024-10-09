package fechaYhora;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;

public class EjemploTemporal {
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.now();
		System.out.println();
		System.out.println("Date = " + fecha);
		System.out.println("Year = " + fecha.getYear());
		System.out.println("Year = " + fecha.get(ChronoField.YEAR));

		System.out.println("Month= " + fecha.getMonth().getValue());
		System.out.println("Month= " + fecha.get(ChronoField.MONTH_OF_YEAR));

		System.out.println("Date = " + fecha.getDayOfMonth());
		System.out.println("Date = " + fecha.get(ChronoField.DAY_OF_MONTH));

		System.out.println("DOW  = " + fecha.getDayOfWeek().getValue());
		System.out.println("DOW  = " + fecha.get(ChronoField.DAY_OF_WEEK) + "\n");

		int field = 0;
		long epoch = fecha.getLong(ChronoField.EPOCH_DAY);
		System.out.println("Day of epoch: " + epoch);
		field = fecha.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
		System.out.println("Week in the month: " + field);
		field = fecha.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR);
		System.out.println("Day of the week in an year: " + field);
		field = fecha.get(ChronoField.ALIGNED_WEEK_OF_MONTH);
		System.out.println("Aligned Week in the month: " + field);
		field = fecha.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
		System.out.println("Aligned  week in an year: " + field);
		field = fecha.get(ChronoField.ERA);
		System.out.println("Era: " + field);

		LocalTime time = LocalTime.now();
		System.out.println("Time  = " + time);
		System.out.println("Hour  = " + time.getHour());
		System.out.println("Hour  = " + time.get(ChronoField.HOUR_OF_DAY));

		System.out.println("Minute= " + time.getMinute());
		System.out.println("Minute= " + time.get(ChronoField.MINUTE_OF_HOUR));

		System.out.println("Second= " + time.getSecond());
		System.out.println("Second= " + time.get(ChronoField.SECOND_OF_MINUTE));

		System.out.println("Nano  = " + time.getNano());
		System.out.println("Nano  = " + time.get(ChronoField.NANO_OF_SECOND));

		System.out.println("----------------------------------------");
		System.out.println(fecha + "-" +isLastOfThisWeekDayInMonth(fecha));
		System.out.println(proximoLunes(fecha));
		LocalDate enFin = LocalDate.of(2022,2,28);
		System.out.println(enFin + "-" +isLastOfThisWeekDayInMonth(enFin));
		System.out.println(proximoLunes(enFin));
	}

	public static boolean isLastOfThisWeekDayInMonth(Temporal temporalG) {
		if (temporalG.isSupported(ChronoField.DAY_OF_MONTH) && temporalG.isSupported(ChronoField.DAY_OF_WEEK)) {
			final int day = temporalG.get(ChronoField.DAY_OF_MONTH);
			final int max = (int) ChronoField.DAY_OF_MONTH.rangeRefinedBy(temporalG).getMaximum();
			System.out.println("max:" + max);
			return day + 7 <= max;

		} else {
			System.out.println("no soportado");
			return false;
		}
	}
	
	public static TemporalAccessor proximoLunes(Temporal fecha) {
		//TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.MONDAY);
		//return fecha.with(temporalAdjuster);	
		return fecha.with(TemporalAdjusters.next(DayOfWeek.MONDAY));		
	}
}
