package faker.generator.models;

import faker.generator.FakeDog;
import faker.generator.FakeDogType;
import lombok.Data;

@Data
public class Dog {
    @FakeDog(FakeDogType.NAME)
    private String name;

    @FakeDog(FakeDogType.BREED)
    private String breed;

    @FakeDog(FakeDogType.SOUND)
    private String sound;

    @FakeDog(FakeDogType.MEME_PHRASE)
    private String memePhrase;

    @FakeDog(FakeDogType.AGE)
    private String age;

    @FakeDog(FakeDogType.COAT_LENGTH)
    private String coatLength;

    @FakeDog(FakeDogType.GENDER)
    private String gender;

    @FakeDog(FakeDogType.SIZE)
    private String size;
}