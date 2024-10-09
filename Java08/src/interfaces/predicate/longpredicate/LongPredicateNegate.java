package interfaces.predicate.longpredicate;

import java.util.function.LongPredicate;

public class LongPredicateNegate {

	public static void main(String[] args) {
		// Implemento la interfaz - - - -
		long a = 2147483755L;
		long b = 2147483648L;
		LongPredicate par = x -> x % 2 == 0;
		LongPredicate impar = par.negate();

		System.out.println("Es impar " + a + " :" + impar.test(a));
		System.out.println("Es impar " + b + " :" + impar.test(b));
	}
}