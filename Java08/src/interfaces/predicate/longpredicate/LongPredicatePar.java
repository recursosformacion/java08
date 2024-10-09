package interfaces.predicate.longpredicate;

import java.util.function.LongPredicate;

public class LongPredicatePar {

	public static void main(String[] args) {
		// Implemento la interfaz - - - -
		long a = 2147483755L;
		long b = 2147483648L;
		LongPredicate par = x -> x % 2 == 0;

		System.out.println("Es par " + a + " :" + par.test(a));
		System.out.println("Es par " + b + " :" + par.test(b));
	}
}
