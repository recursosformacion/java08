package interfaces.unary.doubleunaryoperator;

import java.util.function.DoubleUnaryOperator;

public class BasicoAndThen {

	public static void main(String[] args) {

		//implemento la interface
		DoubleUnaryOperator mitad = a -> a/2; 
		
		//le añado una funcion antes de la que tenia
		DoubleUnaryOperator  mitadp = a ->a + 3;
				

		// pruebo el método recien implementado
		System.out.println(mitad.andThen(mitadp).applyAsDouble(100));
					// ----> 53

	}
}
