package faker.generator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeDragonBallType {
    CHARACTER("dragon_ball.characters");
    private String fakerKey;
}
