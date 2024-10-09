package interfaces.bifunction.tolongbifunction;

import java.util.function.ToLongBiFunction;

public class BasicoLong {

	public static void main(String[] args) {
		
		ToLongBiFunction<Integer, Integer> suma = (x, y) -> x + y;
		
		long res = suma.applyAsLong(10,25);
		
		System.out.println(res); //----> 35
	}
}
