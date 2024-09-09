package chap07.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface AnnotationName {
    String elementNameOne();
    int elementNameTwo() default 5;
}
