package faker.generator.models;

import faker.generator.FakeBookType;
import faker.generator.FakeMedical;
import faker.generator.FakeMedicalType;
import lombok.Data;

@Data
public class Medical {

    @FakeMedical(FakeMedicalType.MEDICINE)
    private String medicineName;

    @FakeMedical(FakeMedicalType.DISEASE)
    private String diseaseName;

    @FakeMedical(FakeMedicalType.HOSPITAL)
    private String hospitalName;

    @FakeMedical(FakeMedicalType.SYMPTOMS)
    private String symptom;
}
