package interfaces.unary;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BasicoAndThen {

	public static void main(String[] args) {

		//implemento la interface
		//indicando que recibira integers y devolvera doubles
		UnaryOperator<Double> mitad = a -> a/2.0; 
		
		//le añado una funcion antes de la que tenia
		UnaryOperator<Double>  mitadp = a ->a + 3;
				

		// pruebo el método recien implementado
		System.out.println(mitad.andThen(mitadp).apply(100.0)); // ----> 53.0

	}
}
