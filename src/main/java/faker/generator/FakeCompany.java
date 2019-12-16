package faker.generator;

import com.sun.org.apache.bcel.internal.generic.FADD;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeCompany {
    FakeCompanyType value() default FakeCompanyType.NAME;
}
