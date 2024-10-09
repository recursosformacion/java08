package interfaces.unary.longunaryoperator;

import java.util.function.LongUnaryOperator;

public class BasicoAndThen {

	public static void main(String[] args) {

		//implemento la interface
		LongUnaryOperator mitad = a -> a/2; 
		
		//le añado una funcion antes de la que tenia
		LongUnaryOperator  mitadp = a ->a + 3;
				

		// pruebo el método recien implementado
		System.out.println(mitad.andThen(mitadp).applyAsLong(100)); // ----> 53

	}
}
