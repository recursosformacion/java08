package interfaces.function;

public class GrabacionUso {

	public static void main(String[] args) {
		
		Grabacion<String> c = s -> System.out.println(s);
		
		c.imprimir("Esto es un mensaje");

	}

}
