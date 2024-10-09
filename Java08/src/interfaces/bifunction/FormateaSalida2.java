package interfaces.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FormateaSalida2 {

	public static void main(String[] args) {
		
		String resul = aCompleto(5,2,
				(a,b)->Math.pow(a,b),
				c-> "Resultado: " + String.valueOf(c));
		
		System.out.println(resul);
// mas -----------------------------------------------------		
		String resul1 = aCompleto("Probando con ",2,
				(a,b)->String.valueOf(a) + String.valueOf(b),
				c-> "Resultado: " + String.valueOf(c));
		
		System.out.println(resul);
		
	}
	
	public static <A,B,R1,R2> R2 aCompleto(
			A a1,
			B a2, 
			BiFunction<A,B,R1> fb,
			Function<R1, R2> f1) {
		
		return fb.andThen(f1).apply(a1,a2);
	}
		


}
