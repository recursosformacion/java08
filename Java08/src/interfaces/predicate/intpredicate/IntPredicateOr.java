package interfaces.predicate.intpredicate;

import java.util.function.IntPredicate;

public class IntPredicateOr {

	public static void main(String[] args) {
		//Implemento la interfaz - - - -
		IntPredicate menor7 = x -> x<7;
		IntPredicate mayor45 = x -> x>45;
		
		System.out.println("Es correcto 5:" + menor7.or(mayor45).test(5));
		System.out.println("Es correcto 25:" + menor7.or(mayor45).test(25));
		System.out.println("Es correcto 60:" + menor7.or(mayor45).test(60));
	}
}
