package interfaces.predicate.intpredicate;

import java.util.function.IntPredicate;

public class IntPredicatePar {

	public static void main(String[] args) {
		//Implemento la interfaz - - - -
		IntPredicate par = x -> x%2 == 0;
		
		System.out.println("Es par 25:" + par.test(25));
		System.out.println("Es par 12:" + par.test(12));
		
		
	}
}
