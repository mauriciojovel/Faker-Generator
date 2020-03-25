package faker.generator;

import faker.generator.services.FakeInternetService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeInternetService.class)
public @interface FakeInternet {
  FakeInternetType value() default FakeInternetType.EMAIL;
  String localPart() default "";
  boolean isEmailSafe() default false;
  int imageWidth() default -1;
  int imageHeight() default -1;
  boolean isImageGray() default false;
  String imageText() default "";
  int passwordMin() default 8;
  int passwordMax() default 16;
  boolean passwordIncludeUppercase() default false;
  boolean passwordIncludeSpecialCharacters() default false;
  String macAddressPrefix() default "";
  String[] slugWords() default {};
  String slugSeparator() default "-";
}
