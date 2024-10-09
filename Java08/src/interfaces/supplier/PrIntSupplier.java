package interfaces.supplier;

import java.util.function.IntSupplier;

public class PrIntSupplier {

	public static void main(String[] args) {
		
		IntSupplier si = ()-> 132;
		
		System.out.println(si.getAsInt()); // ---> 132
	}

}
