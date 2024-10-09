package interfaces.function.todoublefunction;


import java.util.function.ToDoubleFunction;

public class BasicoDeString {

	public static void main(String[] args) {
		
		//implemento la interface
		//indicando que Entregare string
		ToDoubleFunction<String> i  = (x)-> Double.parseDouble(x);
		
		//pruebo el método recien implementado
		double num = i.applyAsDouble("2.3859");
		System.out.println(num);
				// ===> 2.3859

	}
}
