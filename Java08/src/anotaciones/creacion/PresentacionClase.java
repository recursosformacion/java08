package anotaciones.creacion;

import java.lang.annotation.*;

@Documented								// Para que aparezca en JavaDoc
@Target(value=ElementType.TYPE)
@Retention(value= RetentionPolicy.SOURCE)
@interface PresentacionClase {
	String autor();
	String fecha();
	int version() default 1;
	String fechaUltimaModificacion() default "N/A";
	String autorUltimaModificacion() default "N/A";
    String[] controllers() default {""};
}
