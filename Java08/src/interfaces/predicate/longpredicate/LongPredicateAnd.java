package interfaces.predicate.longpredicate;

import java.util.function.LongPredicate;

public class LongPredicateAnd {

	public static void main(String[] args) {
		
		long a = 2147483755L;
		long b = 2147483647L;
		long c = 3125572296L;
		
		//Implemento la interfaz - - - -
		LongPredicate par = x -> x%2 == 0;
		LongPredicate mayor = x -> x > 2147483754L;
		
		System.out.println(
				"Es correcto " + a + ":" + par.and(mayor).test(a));
		System.out.println(
				"Es correcto " + b + ":" + par.and(mayor).test(b));
		System.out.println(
				"Es correcto " + c + ":" + par.and(mayor).test(c));
	}
}
