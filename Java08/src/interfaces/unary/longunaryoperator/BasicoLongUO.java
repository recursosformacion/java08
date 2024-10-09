package interfaces.unary.longunaryoperator;

import java.util.function.LongUnaryOperator;

public class BasicoLongUO {

	public static void main(String[] args) {
		
		LongUnaryOperator iden = x -> x-25;
		System.out.println(iden.applyAsLong(Long.MAX_VALUE));
					// --->9223372036854775782
	}
}
