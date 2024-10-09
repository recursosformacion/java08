package interfaces.supplier;

import java.util.function.Supplier;

public class PruebasSupplier {

	public static void main(String[] args) {
		Supplier<String> dato = () -> "Letrero devuelto";
		
		System.out.println(dato.get());
			//en consola:	Letrero devuelto
	}

}
