package fechaYhora;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;
  
//https://www.javabrahman.com/java-8/java-8-how-to-get-day-of-week-month-in-spanish-french-for-any-date-using-locale/

public class pr {
    public static void main(String[] args)
    {
  
        // create WeekFields
        WeekFields weekFields
            = WeekFields.of(DayOfWeek.MONDAY, 1);
  
        // apply weekOfMonth()
        TemporalField weekOfMonth
            = weekFields.weekOfMonth();
  
        // create a LocalDate
        LocalDate day
            = LocalDate.of(2022, 1, 10);
  
        // get week of month for localdate
        int wom = day.get(weekOfMonth);
  
        // print results
        System.out.println(weekFields);
        System.out.println("week of month for "
                           + day + " :" + wom);
        
        //-----------------------con LOCALE US
        Locale localeUS = new Locale("EN", "US");
        
        // create WeekFields
        WeekFields weekFieldsUS = WeekFields.of(localeUS);
        TemporalField weekOfMonthUS = weekFieldsUS.weekOfMonth();
  
        // print results
        System.out.println(weekFieldsUS);
        System.out.println("Y segun LOCALE US "+ day.get(weekOfMonthUS));
        
      //-----------------------con LOCALE ES
        Locale localeES = new Locale("es", "ES");
        
        // create WeekFields
        WeekFields weekFieldsES = WeekFields.of(localeES);
        TemporalField weekOfMonthES = weekFieldsES.weekOfMonth();
  
        // print results
        System.out.println(weekFieldsES);
        System.out.println("Y segun LOCALE ES "+ day.get(weekOfMonthES));
        
        String dateInSpanish=day.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy",localeES));
        System.out.println(day + " in Spanish: "+dateInSpanish);
        
        String dateInSpanish2=day.format(DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy",localeES));
        System.out.println(day + " in Spanish: "+dateInSpanish2);
        
        String dateInSpanish3=day.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy",Locale.ENGLISH));
        System.out.println(day + " in English: "+dateInSpanish3);
    }
}
