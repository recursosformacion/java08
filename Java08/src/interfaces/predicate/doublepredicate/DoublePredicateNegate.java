package interfaces.predicate.doublepredicate;

import java.util.function.DoublePredicate;

public class DoublePredicateNegate {

	public static void main(String[] args) {
		double a = 113.25;
		double b = 322.00;
		
		// Implemento la interfaz - - - -
		DoublePredicate par = x -> x % 2 == 0;
		DoublePredicate impar = par.negate();

		System.out.println("Es impar " + a + " :" + impar.test(a));
		System.out.println("Es impar " + b + " :" + impar.test(b));
	}
}