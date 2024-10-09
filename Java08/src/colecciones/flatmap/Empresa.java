package colecciones.flatmap;

import java.util.List;

public class Empresa {
	
	private String nombre;
	private List<Coches> coches;
	
		public Empresa() {
	}

	public Empresa(String nombre, List<Coches> coches) {
		super();
		this.nombre = nombre;
		this.coches = coches;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Coches> getCoches() {
		return coches;
	}
	public void setCoches(List<Coches> coches) {
		this.coches = coches;
	}
	
	public static void print(Empresa empresa) {
		System.out.println("*" + empresa.getNombre());
	}
	
	public void presenta() {
		System.out.println("**" + nombre);
	}
}
