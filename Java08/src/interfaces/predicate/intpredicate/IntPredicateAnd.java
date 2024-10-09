package interfaces.predicate.intpredicate;

import java.util.function.IntPredicate;

public class IntPredicateAnd {

	public static void main(String[] args) {
		//Implemento la interfaz - - - -
		IntPredicate par = x -> x%2 == 0;
		IntPredicate mayor100 = x -> x > 100;
		
		
		System.out.println("Es correcto 25:" + par.and(mayor100).test(25));
		System.out.println("Es correcto 12:" + par.and(mayor100).test(12));
		System.out.println("Es correcto 120:" + par.and(mayor100).test(120));
		System.out.println("Es correcto 121:" + par.and(mayor100).test(121));
	}
}
