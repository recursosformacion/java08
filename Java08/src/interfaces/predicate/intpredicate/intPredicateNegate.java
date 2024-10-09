package interfaces.predicate.intpredicate;

import java.util.function.IntPredicate;

public class intPredicateNegate {

	public static void main(String[] args) {
		//Implemento la interfaz - - - -
		IntPredicate par = x -> x%2 == 0;
		
		IntPredicate impar = par.negate();
		
		System.out.println("Es impar 25:" + impar.test(25));
		System.out.println("Es impar 12:" + impar.test(12));
		
		
	}
}