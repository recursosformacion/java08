package interfaces.unary.longunaryoperator;

import java.util.function.LongUnaryOperator;

public class BasicoCompose {

	public static void main(String[] args) {
		
		//implemento la interface
		LongUnaryOperator mitad = a -> a/2; 
		
		//le añado una funcion antes de la que tenia
		LongUnaryOperator mitadp = a ->a + 3;
				
		//pruebo el método recien implementado
		System.out.println(mitad.compose(mitadp).applyAsLong(100L)); //----> 51
	}
}
