package interfaces.bifunction.todoublebifunction;

import java.util.function.ToDoubleBiFunction;

public class BasicoDouble {

	public static void main(String[] args) {
		
		ToDoubleBiFunction<Integer, Integer> suma = (x, y) -> (double) (x + y);
		
		double res = suma.applyAsDouble(10,25);
		
		System.out.println(res); //----> 35.0
	}
}
