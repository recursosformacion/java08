package interfaces.unary;

import java.util.function.UnaryOperator;

public class OperadorUnaryIdentity {

	public static void main(String[] args) {
		
		UnaryOperator<String> iden = UnaryOperator.identity();
		System.out.println(iden.apply("probando"));  //probando

	}

}
