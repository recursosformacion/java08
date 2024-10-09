package interfaces.function.tointfunction;

import java.util.function.ToIntFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que recibira un Integer
		ToIntFunction<Integer> mitad = a -> a/2; 
		
		//pruebo el método recien implementado
		int num = mitad.applyAsInt(100);
		System.out.println(num); // ===> 50
	}
}
