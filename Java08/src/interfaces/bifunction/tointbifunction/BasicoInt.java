package interfaces.bifunction.tointbifunction;

import java.util.function.ToIntBiFunction;

public class BasicoInt {

	public static void main(String[] args) {
		
		ToIntBiFunction<Integer, Integer> suma = (x, y) -> x + y;
		
		int res = suma.applyAsInt(10,25);
		
		System.out.println(res); //----> 35
	}
}
