package interfaces.function.doublefunction;

import java.util.function.DoubleFunction;

public class Basico {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que  devolvera Double
		DoubleFunction<Double> mitad = a -> a/2.0; 
		
		//pruebo el método recien implementado
		System.out.println(mitad.apply(100)); // ===> 50.0

	}
}
