package faker.generator;

import faker.generator.services.FakeColorService;
import faker.generator.services.FakeCryptoService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeCryptoService.class)
public @interface FakeCrypto {
    FakeCryptoType value() default FakeCryptoType.MD5;
}