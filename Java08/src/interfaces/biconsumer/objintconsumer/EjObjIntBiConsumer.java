package interfaces.biconsumer.objintconsumer;

import java.util.function.ObjIntConsumer;

public class EjObjIntBiConsumer {

	public static void main(String[] args) {
		ObjIntConsumer<String> presenta = (x,l) -> {
			String corta = x.substring(0, l);
			System.out.println(corta.toLowerCase());
		};
		
		presenta.accept("PRUEBAS",2);
		
		//Presentara por consola: pr
	}

}
