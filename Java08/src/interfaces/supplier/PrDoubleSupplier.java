package interfaces.supplier;

import java.util.function.LongSupplier;

public class PrDoubleSupplier {

	public static void main(String[] args) {
		
		LongSupplier val = ()-> Long.MAX_VALUE;
		
		System.out.println(val.getAsLong()); 
					// ---> 9223372036854775807
	}

}
