package faker.generator.models;
import faker.generator.FakeDragonBall;
import faker.generator.FakeDragonBallType;
import lombok.Data;

@Data
public class DragonBall {
    @FakeDragonBall(FakeDragonBallType.CHARACTER)
    private String character;
}
