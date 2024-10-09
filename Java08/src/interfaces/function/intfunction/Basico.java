package interfaces.function.intfunction;

import java.util.function.IntFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que devolvera integers 
		IntFunction<Integer> mitad = a -> a/2; 
		
		//pruebo el método recien implementado
		System.out.println(mitad.apply(100)); // ===> 50

	}
}
