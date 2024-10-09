package fechaYhora.MonthDay;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class MonthDayCreate {

	public static void main(String[] args) {
		
		MonthDay ahora= MonthDay.now();
		
		Clock clock = Clock.systemDefaultZone();		
		MonthDay ahoraDef = MonthDay.now(clock);		
		MonthDay ahoraMX = MonthDay.now(ZoneId.of("America/Mexico_City"));
		
		System.out.println("Ahora        :" + ahora);
		System.out.println("Ahora Def    :" + ahoraDef);
		System.out.println("Ahora MX     :" + ahoraMX);
//---of		
		MonthDay unDia = MonthDay.of(11, 30);
		MonthDay otrDia = MonthDay.of(Month.JANUARY, 15 );
		
		System.out.println("unDia        :" + unDia);
		System.out.println("otrDia       :" + otrDia);
// parse		
		MonthDay dParse = MonthDay.parse("--11-21");
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM dd");
        MonthDay dParseF = MonthDay.parse("12 01", formato);
        
        System.out.println("dParse       :" + dParse);
		System.out.println("dParseF      :" + dParseF);		
// from		
		LocalDateTime mas = LocalDateTime.now();
		MonthDay pFrom = MonthDay.from(mas);
		System.out.println("dFrom        :" + pFrom);	
	}

}
