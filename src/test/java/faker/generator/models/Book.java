package faker.generator.models;

import faker.generator.FakeBook;
import faker.generator.FakeBookType;
import lombok.Data;

@Data
public class Book {
    @FakeBook(FakeBookType.TITLE)
    private String title;

    @FakeBook(FakeBookType.AUTHOR)
    private String author;

    @FakeBook(FakeBookType.GENRE)
    private String genre;

    @FakeBook(FakeBookType.PUBLISHER)
    private String publisher;

}
