package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeMedical;

import java.lang.reflect.Field;

public class FakeMedicalService implements FakeService<FakeMedical> {
    @Override
    public void setValue(FakeMedical annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case MEDICINE:
                target.set(data, faker.medical().medicineName());
                break;
            case DISEASE:
                target.set(data, faker.medical().diseaseName());
                break;
            case HOSPITAL:
                target.set(data, faker.medical().hospitalName());
                break;
            case SYMPTOMS:
                target.set(data, faker.medical().symptoms());
        }
    }
}
