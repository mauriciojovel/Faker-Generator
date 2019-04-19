package faker.generator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import faker.generator.models.App;
import faker.generator.models.Artist;
import faker.generator.models.Avatar;
import faker.generator.models.Doctor;
import faker.generator.models.Grecia;
import faker.generator.models.People;
import faker.generator.models.Person;

import java.util.Locale;
import java.util.Optional;
import org.junit.Test;

public class FakerGenTest {

  @Test
  public void testName() {
    Optional<Person> p = FakerGen.create(Person.class);
    assertTrue(p.isPresent());
    p.ifPresent(pe -> assertNotNull(pe.getName()));
  }

  @Test
  public void testNewInstance() {
    Optional<Doctor> d = FakerGen.create(Doctor.class);
    assertTrue(d.isPresent());
    d.ifPresent(doctor -> {
      assertNotNull(doctor.getPerson());
      assertNotNull(doctor.getPerson().getName());
      assertNotNull(doctor.getPerson().getDoctor());
    });
  }

  @Test
  public void testNewCollection() {
    Optional<People> p = FakerGen.create(People.class);
    assertTrue(p.isPresent());
    p.ifPresent(people -> {
      assertNotNull(people.getPeople());
      assertFalse(people.getPeople().isEmpty());
      people.getPeople().forEach(per -> {
        assertNotNull(per.getPeople());
      });
    });
  }

  @Test
  public void testAncient() {
    Optional<Grecia> g = FakerGen.create(Grecia.class);
    assertTrue(g.isPresent());
    g.ifPresent(grecia -> assertNotNull(grecia.getGod()));
  }

  @Test
  public void testAvatar() {
    Optional<Avatar> g = FakerGen.create(Avatar.class);
    assertTrue(g.isPresent());
    g.ifPresent(av -> assertNotNull(av.getImage()));
  }

  @Test
  public void testApp() {
    Optional<App> g = FakerGen.create(App.class);
    assertTrue(g.isPresent());
    g.ifPresent(app -> assertNotNull(app.getAuthor()));
  }

  @Test
  public void testArtist() {
    Optional<Artist> g = FakerGen.create(Artist.class);
    assertTrue(g.isPresent());
    g.ifPresent(artist -> assertNotNull(artist.getName()));
  }

  @Test
  public void testChangeLanguage() {
    FakerGen.changeLanguage(Locale.FRANCE);
  }
}
