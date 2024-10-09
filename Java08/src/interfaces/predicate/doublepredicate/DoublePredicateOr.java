package interfaces.predicate.doublepredicate;

import java.util.function.DoublePredicate;

public class DoublePredicateOr {

	public static void main(String[] args) {

		double a = 45.10;
		double b = 123;
		double c = 410.08;

		// Implemento la interfaz - - - -
		DoublePredicate menor = x -> x < 100;
		DoublePredicate mayor = x -> x > 300;

		System.out.println(
				"Es correcto " + a + ":" + menor.or(mayor).test(a));
		System.out.println(
				"Es correcto " + b + ":" + menor.or(mayor).test(b));
		System.out.println(
				"Es correcto " + c + ":" + menor.or(mayor).test(c));
	}
}
