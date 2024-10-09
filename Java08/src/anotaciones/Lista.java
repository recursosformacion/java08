package anotaciones;

//Importing required packages for repeating annotation   
import java.lang.annotation.Repeatable;  
import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;  


public class Lista {  
	
	//Declaring repeatable annotation type  
	@Repeatable(Games.class)  
	@interface Game{  
	 String name();  
	 String day();  
	}  
	//Declaring container for repeatable annotation type  
	@Retention(RetentionPolicy.RUNTIME)  
	@interface Games{  
	 Game[] value();  
	}  
	//Repeating annotation  
	@Game(name = "Cricket",  day = "Sunday")  
	@Game(name = "Hockey",   day = "Friday")  
	@Game(name = "Football", day = "Saturday")  
	
 public static void main(String[] args) {  
     // Getting annotation by type into an array  
     Game[] game = Lista.class.getAnnotationsByType(Game.class);  
     for (Game game2 : game) {    // Iterating values  
         System.out.println(game2.name()+" on "+game2.day());  
     }  
 }  
} 