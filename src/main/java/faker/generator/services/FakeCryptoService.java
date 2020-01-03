package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeCrypto;

import java.lang.reflect.Field;

public class FakeCryptoService implements FakeService<FakeCrypto> {
    @Override
    public void setValue(FakeCrypto annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case MD5:
                target.set(data, faker.crypto().md5());
                break;
            case SHA1:
                target.set(data, faker.crypto().sha1());
                break;
            case SHA256:
                target.set(data, faker.crypto().sha256());
                break;
            case SHA512:
                target.set(data, faker.crypto().sha512());
                break;
        }
    }
}