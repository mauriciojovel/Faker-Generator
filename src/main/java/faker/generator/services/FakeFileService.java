package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeFile;

import java.lang.reflect.Field;

public class FakeFileService implements FakeService<FakeFile> {

    @Override
    public void setValue(FakeFile annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case EXTENSION:
                target.set(data, faker.file().extension());
                break;
            case MIME_TYPE:
                target.set(data, faker.file().mimeType());
                break;
            case FILE_NAME:
                target.set(data, faker.file().fileName());
                break;
        }
    }
}
