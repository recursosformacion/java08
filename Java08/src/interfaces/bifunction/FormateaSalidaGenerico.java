package interfaces.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FormateaSalidaGenerico {

	public static void main(String[] args) {
		
		String resul = aCompleto(5,2,
				(a,b)->Math.pow(a,b),
				c-> "Resultado: " + String.valueOf(c));
		
		//System.out.println(pot.andThen(aString).apply(4, 2));
		System.out.println(resul);
	}
	
	public static <R> R aCompleto(
			Integer a1,
			Integer a2, 
			BiFunction<Integer,Integer,Double> fb,
			Function<Double, R> f1) {
		
		return fb.andThen(f1).apply(a1,a2);
	}
		


}
