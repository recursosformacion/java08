package interfaces.biconsumer.objlongconsumer;

import java.util.function.ObjLongConsumer;

public class EjObjIntConsumer {

	public static void main(String[] args) {
		ObjLongConsumer<String> presenta = (x,v) -> {
			
			System.out.println(x + v);
		};
		
		presenta.accept("PRUEBAS-",Long.MAX_VALUE);
		
		//Presentara por consola: PRUEBAS-9223372036854775807
	}

}
