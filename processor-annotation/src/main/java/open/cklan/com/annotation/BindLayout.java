package open.cklan.com.annotation;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * AUTHOR：lanchuanke on 17/8/2 18:15
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface BindLayout {
   int value();
}
