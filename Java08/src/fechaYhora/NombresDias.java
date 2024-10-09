package fechaYhora;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.stream.Stream;

public class NombresDias {

	public static void main(String[] args) {
		TextStyle estilo = TextStyle.FULL;		//NARROW, SHORT , + _STANDALONE
		Locale locale = Locale.getDefault();
		System.out.println("\nSegun configuracion, nombre largo --------------------");
		listaDias(estilo, locale);
		listaCompleja(locale);
		
		locale = Locale.ENGLISH;
		System.out.println("\nIngles, nombre largo --------------------");
		listaDias(estilo, locale);
		
		locale = Locale.FRENCH;
		System.out.println("\nFrances, nombre largo --------------------");
		listaDias(estilo, locale);
		
	}
	
	public static void listaDias(TextStyle estilo, Locale locale) {
		LocalDate ahora = LocalDate.now();
		System.out.println("dia actual-"+ahora.	getDayOfWeek().getDisplayName(estilo, locale));
		
		
		
		DayOfWeek[] dias = DayOfWeek.values();
		Stream.of(dias).map((DayOfWeek x) -> x.getDisplayName(estilo,locale))
			.forEach(System.out::println);

	}
	
	public static void listaCompleja(Locale locale) {
		DayOfWeek[] dias = DayOfWeek.values();
		for (DayOfWeek cur : dias) {
			System.out.println(
				cur.getDisplayName(TextStyle.NARROW, locale)	 + "-" +
				cur.getDisplayName(TextStyle.SHORT, locale)	 + "-" +
				cur.getDisplayName(TextStyle.FULL, locale)	 
					);
		}
		
	}

}
