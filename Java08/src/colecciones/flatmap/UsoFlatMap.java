package colecciones.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class UsoFlatMap {

	static Empresa emp1;
	static Empresa emp2;
	static Empresa emp3;

	static List<Empresa> listaEmpresas = new ArrayList<Empresa>();

	public static void main(String[] args) {

		Coches c1 = new Coches("Dacia Jogger", 7);
		Coches c2 = new Coches("Toyota Proace City Verso", 7);
		Coches c3 = new Coches("Seat Tarraco", 7);
		Coches c4 = new Coches("Cupra Born", 5);
		Coches c5 = new Coches("Ford Mustang Mach-E", 5);
		Coches c6 = new Coches("Kia EV6", 5);
		Coches c7 = new Coches("Mercedes EQA", 5);

		List<Coches> listempresa1 = new ArrayList<Coches>();
		List<Coches> listempresa2 = new ArrayList<Coches>();
		List<Coches> listempresa3 = new ArrayList<Coches>();
		listempresa1.add(c1);
		listempresa1.add(c3);
		listempresa1.add(c7);
		listempresa2.add(c2);
		listempresa2.add(c4);
		listempresa2.add(c6);
		listempresa3.add(c5);
		listempresa3.add(c7);
		listempresa3.add(c1);
		listempresa3.add(c2);
		listempresa1.add(c6);

		emp1 = new Empresa("La Empresa 1", listempresa1);
		emp2 = new Empresa("La Empresa 2", listempresa2);
		emp3 = new Empresa("La Empresa 3", listempresa3);

		listaEmpresas.add(emp1);
		listaEmpresas.add(emp2);
		listaEmpresas.add(emp3);

		listaTradicional();
		System.out.println("***********************************");
		listaCon_flatMap();
		System.out.println("***********************************");
		listaCon_flatMap2();
	}

	// lista coches modo tradicional
	static void listaTradicional() {

		for (Empresa emp : listaEmpresas) {
			System.out.println(emp.getNombre());
			for (Coches auto : emp.getCoches()) {
				System.out.println("... " + auto.getMarca());
			}
		}

	}

	static void listaCon_flatMap() {
		listaEmpresas.stream()
//			.peek(Empresa::print)
//			.peek(Empresa::presenta)
//			.peek(v::presenta)
			
			.peek(e -> System.out.println(e.getNombre()))
			.map(emp -> emp.getCoches())
			.flatMap(coches -> coches.stream())
			.forEach(new Consumer<Coches>() {
					public void accept(Coches t) {
						System.out.println("... " + t.getMarca());
					}
				});

	}

	static void listaCon_flatMap2() {
		
//		Empresa nueva = Empresa::new;
		
		
		listaEmpresas.stream().peek(e -> System.out.println(e.getNombre())).map(emp -> emp.getCoches())
				.flatMap(coches -> coches.stream()).map(coches -> coches.getMarca()).distinct()
				.forEach(c -> System.out.println("... " + c));

	}

}
