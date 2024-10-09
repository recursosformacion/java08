package interfaces.supplier;

import java.util.function.DoubleSupplier;

public class PrLongSupplier {

	public static void main(String[] args) {
		
		DoubleSupplier val = ()-> Double.MAX_VALUE;
		
		System.out.println(val.getAsDouble()); 
					// ---> 1.7976931348623157E308
	}
}
