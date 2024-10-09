package stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class ArrayStreamByte {

	public static void main(String[] args) {
		
		int[] array1= new int[] { 0,1,2,3,4,5,6,7,8,9};
		
//		int[] array2= new int[array1.length];
//		
//		int x=0;
//		for(int i=0;i<array1.length;i++) {
//			if (array1[i]%2 == 0) {
//				array2[x++] = array1[i];
//			}
//		}
		
		int[] array2 = Arrays.stream(array1)
				.filter(s -> s%2 == 0)
				.toArray();
		
		
				
		Arrays.stream(array2)
			.forEach(System.out::println);
		
		long contador = Arrays.stream(array1)
				.filter(s -> s%2 == 0)
				.count();
		System.out.println("Contador: " + contador);
		
		System.out.println("****************************");
		Random rand = new Random();
		long dato = Stream.generate(()-> rand.nextInt(10000))	
				.distinct()
			.limit(20)
			.peek((a)-> {
				System.out.println("..........................................");
				System.out.println(a);
			})
			.count();
			
	}

}
