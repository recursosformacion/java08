package interfaces.unary;

import java.util.function.UnaryOperator;

public class OperadorUnary {

	public static void main(String[] args) {
		
		UnaryOperator<String> resul = x -> x.toUpperCase();
		System.out.println(resul.apply("probando")); // PROBANDO

	}

}
