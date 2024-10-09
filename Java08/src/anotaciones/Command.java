package anotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(value=ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface Command //Descripción. Tenga en cuenta que hay una @ delante de interface;
{
    //El comando del que se encargará la función (por ejemplo, "hola");
    String name();
     //Argumentos de los comandos, que se utilizarán para obtener una lista de comandos
    String args();
     //Número mínimo de argumentos, asignado inmediatamente a 0 (lógico)
    int minArgs() default 0;
    //Descripción, también para la lista
    String desc();
     //Número máximo de argumentos. Generalmente no es necesario, pero también puede utilizarse
    int maxArgs() default Integer.MAX_VALUE;
     //Mostrar o no el comando en la lista (no es necesario en absoluto, pero puede ser útil)
    boolean showInHelp() default true;
    //Qué comandos se considerarían equivalentes a los nuestros
    //(Por ejemplo para "hola", podría ser "holi", "oye", etc.)
    //No es racional tener una función para cada caso
    String[] aliases();
}