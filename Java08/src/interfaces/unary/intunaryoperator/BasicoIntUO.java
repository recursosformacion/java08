package interfaces.unary.intunaryoperator;

import java.util.function.IntUnaryOperator;

public class BasicoIntUO {

	public static void main(String[] args) {
		
		IntUnaryOperator iden = x -> x-25;
		System.out.println(iden.applyAsInt(100));  // --->75

	}

}
