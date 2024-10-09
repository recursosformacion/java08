package interfaces.unary.doubleunaryoperator;

import java.util.function.DoubleUnaryOperator;

public class BasicoCompose {

	public static void main(String[] args) {
		
		//implemento la interface
		DoubleUnaryOperator mitad = a -> a/2; 
		
		//le añado una funcion antes de la que tenia
		DoubleUnaryOperator mitadp = a ->a + 3;
				
		//pruebo el método recien implementado
		System.out.println(mitad.compose(mitadp).applyAsDouble(100.0)); 
					//----> 51
	}
}
