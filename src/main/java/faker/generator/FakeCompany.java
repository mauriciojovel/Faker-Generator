package faker.generator;

import com.sun.org.apache.bcel.internal.generic.FADD;
import faker.generator.services.FakeCompanyService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeCompanyService.class)
public @interface FakeCompany {
    FakeCompanyType value() default FakeCompanyType.NAME;
}
