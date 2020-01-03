package faker.generator;

import faker.generator.services.FakeFileService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeFileService.class)
public @interface FakeFile {
    FakeFileType value() default FakeFileType.EXTENSION;
}
