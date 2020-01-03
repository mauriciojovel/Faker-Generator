package faker.generator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeRobinType {
    QUOTE("robin.quotes");
    private String fakerKey;
}
