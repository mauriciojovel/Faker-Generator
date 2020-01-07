package faker.generator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeMatzType {
    QUOTE("matz.quotes");

    private String fakerKey;
}
