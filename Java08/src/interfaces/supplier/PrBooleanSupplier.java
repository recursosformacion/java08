package interfaces.supplier;

import java.util.function.BooleanSupplier;

public class PrBooleanSupplier {

	public static void main(String[] args) {
		
		BooleanSupplier si = ()-> true;
		
		System.out.println(si.getAsBoolean()); // ---> true
	}

}
