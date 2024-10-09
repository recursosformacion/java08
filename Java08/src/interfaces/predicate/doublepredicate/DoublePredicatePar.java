package interfaces.predicate.doublepredicate;

import java.util.function.DoublePredicate;

public class DoublePredicatePar {

	public static void main(String[] args) {
		
		double a = 113.25;
		double b = 322.00;
		
		// Implemento la interfaz - - - -
		DoublePredicate par = x -> x % 2 == 0;

		System.out.println("Es par " + a + " :" + par.test(a));
		System.out.println("Es par " + b + " :" + par.test(b));
	}
}
