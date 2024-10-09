package interfaces.predicate.doublepredicate;

import java.util.function.DoublePredicate;

public class DoublePredicateAnd {

	public static void main(String[] args) {
		
		double a = 74.0;
		double b = 137;
		double c = 138.0;
		
		//Implemento la interfaz - - - -
		DoublePredicate par = x -> x%2 == 0;
		DoublePredicate mayor = x -> x > 100;
		
		System.out.println(
				"Es correcto " + a + ":" + par.and(mayor).test(a));
		System.out.println(
				"Es correcto " + b + ":" + par.and(mayor).test(b));
		System.out.println(
				"Es correcto " + c + ":" + par.and(mayor).test(c));
	}
}
