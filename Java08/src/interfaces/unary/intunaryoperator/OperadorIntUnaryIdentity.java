package interfaces.unary.intunaryoperator;

import java.util.function.IntUnaryOperator;

public class OperadorIntUnaryIdentity {

	public static void main(String[] args) {
		
		IntUnaryOperator iden = IntUnaryOperator.identity();
		System.out.println(iden.applyAsInt(1357));  //1357

	}

}
