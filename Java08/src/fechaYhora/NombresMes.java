package fechaYhora;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.stream.Stream;

public class NombresMes {

	public static void main(String[] args) {
		TextStyle estilo = TextStyle.FULL;
		Locale locale = Locale.getDefault();
		System.out.println("\nSegun configuracion, nombre largo --------------------");
		listaMeses(estilo, locale);
		listaCompleja(locale);
		
		locale = Locale.ENGLISH;
		System.out.println("\nIngles, nombre largo --------------------");
		listaMeses(estilo, locale);
		listaCompleja(locale);
		
		locale = Locale.FRENCH;
		System.out.println("\nFrances, nombre largo --------------------");
		listaMeses(estilo, locale);
		listaCompleja(locale);
		
	}
	
	public static void listaMeses(TextStyle estilo, Locale locale) {
		LocalDate ahora = LocalDate.now();
		System.out.println("Mes actual-"+ahora.getMonth().getDisplayName(estilo, locale));
		System.out.println("Trimestre actual empieza en-"+ahora.getMonth().firstMonthOfQuarter().getDisplayName(estilo, locale));
		System.out.println("tiene dias="+ahora.getMonth().length(false));
			
		Month[] meses = Month.values();
		Stream.of(meses).map((Month x) -> x.getDisplayName(estilo,locale))
			.forEach(System.out::println);

	}
	
	public static void listaCompleja(Locale locale) {
		Month[] meses = Month.values();
		for (Month cur : meses) {
			System.out.println(
				cur.getDisplayName(TextStyle.NARROW, locale)	 + "-" +
				cur.getDisplayName(TextStyle.SHORT, locale)	 + "-" +
				cur.getDisplayName(TextStyle.FULL, locale)	 
					);
		}
		
	}

}
