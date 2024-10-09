package interfaces.unary.doubleunaryoperator;

import java.util.function.DoubleUnaryOperator;

public class BasicoDoubleUO {

	public static void main(String[] args) {
		
		DoubleUnaryOperator iden = x -> x/25;
		System.out.println(iden.applyAsDouble(Double.MAX_VALUE));
					// --->7.190772539449263E306
	}
}
