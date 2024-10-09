package interfaces.biconsumer.objdoubleconsumer;

import java.util.function.ObjDoubleConsumer;

public class EjObjDoubleConsumer {

	public static void main(String[] args) {
		
		ObjDoubleConsumer<String> presenta = (x,v) -> {
			System.out.println(x + v);
		};
		
		presenta.accept("Puebas de double-",Double.MAX_VALUE);		
		//Presentara por consola: Puebas de double-1.7976931348623157E308
	}
}
