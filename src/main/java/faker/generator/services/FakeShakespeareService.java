package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeShakespeare;

import java.lang.reflect.Field;

public class FakeShakespeareService implements FakeService<FakeShakespeare> {
    @Override
    public void setValue(FakeShakespeare annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case HAMLET_QUOTE:
                target.set(data, faker.shakespeare().hamletQuote());
                break;
            case AS_YOU_LIKE_IT_QUOTE:
                target.set(data, faker.shakespeare().asYouLikeItQuote());
                break;
            case KING_RICHARD_QUOTE:
                target.set(data, faker.shakespeare().kingRichardIIIQuote());
                break;
            case ROMEO_JULIET_QUOTE:
                target.set(data, faker.shakespeare().romeoAndJulietQuote());
                break;
        }
    }
}