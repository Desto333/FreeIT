package lesson_09.AnnotationsTask;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)     // set annotation as runtime
@Target(ElementType.TYPE)               // annotation is used by classes
public @interface Version {         //create annotation
    double version();               // create mandatory field
    String version_name() default "";   // create optional field
}
