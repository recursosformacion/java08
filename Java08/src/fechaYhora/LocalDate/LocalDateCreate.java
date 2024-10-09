package fechaYhora.LocalDate;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateCreate {

	public static void main(String[] args) {
		
		LocalDate hoy = LocalDate.now();
		
		Clock clock = Clock.systemDefaultZone();		
		LocalDate hoyDef = LocalDate.now(clock);		
		LocalDate hoyMX = LocalDate.now(ZoneId.of("America/Mexico_City"));
		
		System.out.println("Hoy        :" + hoy);
		System.out.println("Hoy Def    :" + hoyDef);
		System.out.println("Hoy MX     :" + hoyMX);
//---of		
		LocalDate unDia = LocalDate.of(2021, 10,29);
		LocalDate otroDia = LocalDate.of(2022, Month.FEBRUARY ,28);
		
		System.out.println("unDia      :" + unDia);
		System.out.println("otroDia    :" + otroDia);
//ofEpoch, ofYear		
		LocalDate desdeEpoch = LocalDate.ofEpochDay(20);
		LocalDate desdeYear  = LocalDate.ofYearDay(2022,360);
		
		System.out.println("desdeEpoch :" + desdeEpoch);
		System.out.println("desdeYear  :" + desdeYear);
// parse		
		LocalDate dParse = LocalDate.parse("2020-08-15");
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDate dParseF = LocalDate.parse("12 febrero 2020", formato);
        
        System.out.println("dParse     :" + dParse);
		System.out.println("dParseF    :" + dParseF);		
// from		
		LocalDateTime ahora = LocalDateTime.now();
		LocalDate pFrom = LocalDate.from(ahora);
		System.out.println("dFrom      :" + pFrom);	
	}

}
