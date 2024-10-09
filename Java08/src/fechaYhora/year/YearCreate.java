package fechaYhora.year;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class YearCreate {

public static void main(String[] args) {
	
	
	Clock clock = Clock.systemDefaultZone();
	
	Year an1 = Year.now();		
	Year an1Def = Year.now(clock);		
	Year an1MX = Year.now(ZoneId.of("America/Mexico_City"));
	
	System.out.println("Hoy        :" + an1);
	System.out.println("Hoy Def    :" + an1Def);
	System.out.println("Hoy MX     :" + an1MX);
	
	Year an2 = Year.of(2021);
	System.out.println("of  2021   :" + an2);
	
	Year an3 = Year.parse("2020");
	System.out.println("parse 2020 :" + an3);

	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    Year an4 = Year.parse("12 febrero 2020", formato);
    System.out.println("parse 12 febrero 2020 :" + an3);
    
    
    Year an5 = Year.from(LocalDate.of(2018, 10,12));
    System.out.println("from Localdate        :" + an5);
}

}
