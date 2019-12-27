package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakerDogType {
    NAME("creature.dog.name"), BREED( "creature.dog.breed" ), SOUND("creature.dog.sound"),
    MEME_PHRASE("creature.dog.meme_phrase"), AGE("creature.dog.age"), COAT_LENGTH("creature.dog.coat_length"),
    GENDER("creature.dog.gender"), SIZE("creature.dog.size");

    private String fakerKey;
}
