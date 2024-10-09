package interfaces.binaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class OperadorBinary {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> max = BinaryOperator.maxBy(Comparator.naturalOrder());
		BinaryOperator<Integer> min = BinaryOperator.minBy(Comparator.naturalOrder());
		BinaryOperator<Integer> suma = (a,b)->a+b;
		
		System.out.println(max.apply(100, 200));		// presenta 200
		System.out.println(min.apply(100, 200));		// presenta 100
		System.out.println(suma.apply(100, 200));		// presenta 300
	}
}
