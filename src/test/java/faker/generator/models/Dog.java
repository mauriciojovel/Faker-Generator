package faker.generator.models;

import faker.generator.FakerDog;
import faker.generator.FakerDogType;
import lombok.Data;

@Data
public class Dog {
    @FakerDog(FakerDogType.NAME)
    private String name;

    @FakerDog(FakerDogType.BREED)
    private String breed;

    @FakerDog(FakerDogType.SOUND)
    private String sound;

    @FakerDog(FakerDogType.MEME_PHRASE)
    private String memePhrase;

    @FakerDog(FakerDogType.AGE)
    private String age;

    @FakerDog(FakerDogType.COAT_LENGTH)
    private String coatLength;

    @FakerDog(FakerDogType.GENDER)
    private String gender;

    @FakerDog(FakerDogType.SIZE)
    private String size;
}