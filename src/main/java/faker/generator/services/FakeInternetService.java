package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeInternet;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.UUID;

public class FakeInternetService implements FakeService<FakeInternet> {
    @Override
    public void setValue(FakeInternet annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case EMAIL:
                if (StringUtils.isEmpty(annotation.localPart())) {
                    if (annotation.isEmailSafe()) {
                        target.set(data, faker.internet().safeEmailAddress());
                    } else {
                        target.set(data, faker.internet().emailAddress());
                    }
                } else {
                    if (annotation.isEmailSafe()) {
                        target.set(data, faker.internet().safeEmailAddress(annotation.localPart()));
                    } else {
                        target.set(data, faker.internet().emailAddress(annotation.localPart()));
                    }
                }
                break;
            case DOMAIN_NAME:
                target.set(data, faker.internet().domainName());
                break;
            case DOMAIN_WORD:
                target.set(data, faker.internet().domainWord());
                break;
            case DOMAIN_SUFFIX:
                target.set(data, faker.internet().domainSuffix());
                break;
            case URL:
                target.set(data, faker.internet().url());
                break;
            case AVATAR:
                target.set(data, faker.internet().image(50, 50));
                break;
            case IMAGE:
                if (annotation.imageWidth() > 0 && annotation.imageHeight() > 0) {
                    target.set(data, faker.internet().image(annotation.imageWidth(),
                            annotation.imageHeight()));
                } else {
                    target.set(data, faker.internet().image());
                }
                break;
            case PASSWORD:
                target.set(data, faker.internet().password(annotation.passwordMin(), annotation.passwordMax(),
                        annotation.passwordIncludeUppercase(), annotation.passwordIncludeSpecialCharacters()));
                break;
            case MAC_ADDRESS:
                target.set(data, faker.internet().macAddress(annotation.macAddressPrefix()));
                break;
            case IPV4:
                target.set(data, faker.internet().ipV4Address());
                break;
            case PRIVATE_IPV4:
                target.set(data, faker.internet().privateIpV4Address());
                break;
            case PUBLIC_IPV4:
                target.set(data, faker.internet().publicIpV4Address());
                break;
            case IPV4_CIDR:
                target.set(data, faker.internet().ipV4Cidr());
                break;
            case IPV6:
                target.set(data, faker.internet().ipV6Address());
                break;
            case IPV6_CIDR:
                target.set(data, faker.internet().ipV6Cidr());
                break;
            case SLUG:
                target.set(data, faker.internet().slug(annotation.slugWords().length == 0 ? null :
                        Arrays.asList(annotation.slugWords()), annotation.slugSeparator()));
                break;
            case UUID:
                if (target.getType().isAssignableFrom(UUID.class)) {
                    target.set(data, UUID.randomUUID());
                } else {
                    target.set(data, faker.internet().uuid());
                }
                break;
        }
    }
}
