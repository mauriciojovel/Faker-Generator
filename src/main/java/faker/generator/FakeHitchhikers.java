package faker.generator;
import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeHitchhikers {
    FakeHitchhikersType value() default FakeHitchhikersType.CHARACTER;
}
