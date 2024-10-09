package interfaces.predicate.longpredicate;

import java.util.function.LongPredicate;

public class LongPredicateOr {

	public static void main(String[] args) {

		long a = 2147483755L;
		long b = 2147483647L;
		long c = 3125572296L;

		// Implemento la interfaz - - - -
		LongPredicate menor = x -> x < 2147483648L;
		LongPredicate mayor = x -> x > 2147483754L;

		System.out.println(
				"Es correcto " + a + ":" + menor.or(mayor).test(a));
		System.out.println(
				"Es correcto " + b + ":" + menor.or(mayor).test(b));
		System.out.println(
				"Es correcto " + c + ":" + menor.or(mayor).test(c));
	}
}
