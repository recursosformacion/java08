package fechaYhora.yearMonth;

import java.time.Clock;
import java.time.YearMonth;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class YearMonthCreate {

public static void main(String[] args) {
	
	YearMonth ames = YearMonth.now();
	
	Clock clock = Clock.systemDefaultZone();		
	YearMonth amesDef = YearMonth.now(clock);		
	YearMonth amesMX = YearMonth.now(ZoneId.of("America/Mexico_City"));
	
	System.out.println("Hoy        :" + ames);
	System.out.println("Hoy Def    :" + amesDef);
	System.out.println("Hoy MX     :" + amesMX);
//---of		
	YearMonth unDia = YearMonth.of(2021, 10);
	YearMonth otroDia = YearMonth.of(2022, Month.FEBRUARY );
	
	System.out.println("unDia      :" + unDia);
	System.out.println("otroDia    :" + otroDia);
// parse		
	YearMonth dParse = YearMonth.parse("2020-08");
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("MMMM yyyy");
    YearMonth dParseF = YearMonth.parse("febrero 2020", formato);
    
    System.out.println("dParse     :" + dParse);
	System.out.println("dParseF    :" + dParseF);		
// from		
	YearMonth ahora = YearMonth.now();
	YearMonth pFrom = YearMonth.from(ahora);
	System.out.println("dFrom      :" + pFrom);	
}

}
