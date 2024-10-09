package interfaces.predicate;

import java.util.function.Predicate;

public class PredicatePar {

	public static void main(String[] args) {
		//Implemento la interfaz - - - -
		Predicate<Integer> par = x -> x%2 == 0;
		
		System.out.println("Es par 25:" + par.test(25));
		System.out.println("Es par 12:" + par.test(12));
		
		Predicate<Integer> impar=par.negate();
		
		System.out.println("*********");
		System.out.println("Es impar 25:" + impar.test(25));
		System.out.println("Es impar 12:" + impar.test(12));
		
		Predicate<Integer> mayor = x -> x>7;
		System.out.println("*********");
		System.out.println("Es correcto 25:" + par.and(mayor).test(25));
		System.out.println("Es correcto 12:" + par.and(mayor).test(12));
	}
}
