package interfaces.unary.intunaryoperator;

import java.util.function.IntUnaryOperator;

public class BasicoCompose {

	public static void main(String[] args) {
		
		//implemento la interface
		IntUnaryOperator mitad = a -> a/2; 
		
		//le añado una funcion antes de la que tenia
		IntUnaryOperator mitadp = a ->a + 3;
				
		//pruebo el método recien implementado
		System.out.println(mitad.compose(mitadp).applyAsInt(100)); //----> 51
	}
}
