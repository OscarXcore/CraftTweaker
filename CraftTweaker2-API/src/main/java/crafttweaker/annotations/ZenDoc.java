package crafttweaker.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface ZenDoc {
    String[] value() default "";
    String[] PackageName() default "";
    String[] ObjectGetters() default "";
    String[] ExampleUsages() default "";
    String[] AdditionalNotes() default "";
}
