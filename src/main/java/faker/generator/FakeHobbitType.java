package faker.generator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeHobbitType {
    CHARACTER("hobbit.character"), THORINSCOMPANY("ancient.primordial"), QUOTE("hobbit.quote"), LOCATION("hobbit.location");

    private String fakerKey;
}
