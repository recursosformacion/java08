package interfaces.unary.longunaryoperator;

import java.util.function.LongUnaryOperator;

public class OperadorIntUnaryIdentity {

	public static void main(String[] args) {
		
		LongUnaryOperator iden = LongUnaryOperator.identity();
		System.out.println(iden.applyAsLong(1357L));  //1357

	}

}
