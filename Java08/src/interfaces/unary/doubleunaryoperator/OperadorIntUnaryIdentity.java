package interfaces.unary.doubleunaryoperator;

import java.util.function.DoubleUnaryOperator;

public class OperadorIntUnaryIdentity {

	public static void main(String[] args) {
		
		DoubleUnaryOperator iden = DoubleUnaryOperator.identity();
		System.out.println(iden.applyAsDouble(1357.25));  //1357.25

	}

}
