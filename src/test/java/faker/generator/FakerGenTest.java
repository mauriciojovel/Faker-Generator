package faker.generator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import faker.generator.models.*;

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
  public void testInternet() {
    Optional<Internet> i = FakerGen.create(Internet.class);
    assertTrue(i.isPresent());
    i.ifPresent(internet -> {
      assertNotNull(internet.getEmail());
      assertNotNull(internet.getSafeEmail());
      assertNotNull(internet.getLocalSafeEmail());
      assertNotNull(internet.getLocalEmail());
      assertNotNull(internet.getDomainName());
      assertNotNull(internet.getDomainWord());
      assertNotNull(internet.getDomainSuffix());
      assertNotNull(internet.getUrl());
      assertNotNull(internet.getAvatar());
      assertNotNull(internet.getImage());
      assertNotNull(internet.getImage800x600());
      assertNotNull(internet.getPassword());
      assertNotNull(internet.getMacAddress());
      assertNotNull(internet.getIpv4());
      assertNotNull(internet.getPrivateIpv4());
      assertNotNull(internet.getPublicIpv4());
      assertNotNull(internet.getIpv4Cird());
      assertNotNull(internet.getIpv6());
      assertNotNull(internet.getIpv6Cird());
      assertNotNull(internet.getSlug());
      assertNotNull(internet.getCustomSlug());
      assertNotNull(internet.getUuid());
    });
  }

  @Test
  public void testArtist() {
    Optional<Artist> g = FakerGen.create(Artist.class);
    assertTrue(g.isPresent());
    g.ifPresent(artist -> assertNotNull(artist.getName()));
  }

  @Test
  public void testEmptyResult() {
    Optional<EmptyModel> e = FakerGen.create(EmptyModel.class);
    assertFalse(e.isPresent());
  }

  @Test
  public void testNumbers() {
    Optional<Numbers> n = FakerGen.create(Numbers.class);
    assertTrue(n.isPresent());
    n.ifPresent(number -> {
      assertNotNull(number.getDigit());
      assertNotNull(number.getNumberBetween());
      assertNotNull(number.getRandomDigit());
      assertNotNull(number.getRandomDigitNonZero());
      assertNotNull(number.getRandomNumber());
      assertNotNull(number.getRandomNumber2());
      assertNotNull(number.getRandomDouble());
    });
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNumberBetweenException() {
    FakerGen.create(NumbersBetweenException.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNumberDoubleException() {
    FakerGen.create(NumbersDoubleException.class);
  }

  @Test
  public void testChangeLanguage() {
    FakerGen.changeLanguage(Locale.FRANCE);
  }

  @Test
  public void testPhoneNumber() {
    Optional<PhoneNumber> p = FakerGen.create(PhoneNumber.class);
    assertTrue(p.isPresent());
    p.ifPresent(pn -> {
      assertNotNull(pn.getPhoneNumber());
      assertNotNull(pn.getCellPhone());
    });
  }

  @Test
  public void testPokemon() {
    Optional<Pokemon> p = FakerGen.create(Pokemon.class);
    assertTrue(p.isPresent());
    p.ifPresent(po -> {
      assertNotNull(po.getName());
      assertNotNull(po.getLocation());
    });
  }

  @Test
  public void testAddress() {
    Optional<Address> a = FakerGen.create(Address.class);
    assertTrue(a.isPresent());
    a.ifPresent(ad -> {
      assertNotNull(ad.getStreetName());
      assertNotNull(ad.getSecondaryAddress());
      assertNotNull(ad.getZipCode());
      assertNotNull(ad.getStreetSuffix());
      assertNotNull(ad.getStreetPrefix());
      assertNotNull(ad.getCitySuffix());
      assertNotNull(ad.getCityPrefix());
      assertNotNull(ad.getCity());
      assertNotNull(ad.getCityName());
      assertNotNull(ad.getState());
      assertNotNull(ad.getStateAbbr());
      assertNotNull(ad.getTimeZone());
      assertNotNull(ad.getCounty());
      assertNotNull(ad.getCountryCode());
      assertNotNull(ad.getFullAddress());
      assertNotNull(ad.getBuildingNumber());
      assertNotNull(ad.getStreetAddressNumber());
      assertNotNull(ad.getStreetAddressWithSecondary());
      assertNotNull(ad.getStreetAddress());
      assertNotNull(ad.getZipCodeByState());
//      assertNotNull(ad.getCountryByZipCode());
      assertNotNull(ad.getLatitude());
      assertNotNull(ad.getLongitude());
    });
  }

  @Test
  public void testBusiness() {
    Optional<Business> b = FakerGen.create(Business.class);
    assertTrue(b.isPresent());
    b.ifPresent(bu -> {
      assertNotNull(bu.getCreditCardExpiry());
      assertNotNull(bu.getCreditCardNumber());
      assertNotNull(bu.getCreditCardExpiry());
    });
  }

  @Test
  public void testChuckNorris() {
    Optional<ChuckNorris> c = FakerGen.create(ChuckNorris.class);
    assertTrue(c.isPresent());
    c.ifPresent( ch -> {
      assertNotNull(ch.getFact());
    });
  }

  @Test
  public void testBook() {
    Optional<Book> b = FakerGen.create(Book.class);
    assertTrue(b.isPresent());
    b.ifPresent(bo -> {
        assertNotNull(bo.getAuthor());
        assertNotNull(bo.getGenre());
        assertNotNull(bo.getPublisher());
        assertNotNull(bo.getTitle());
    });
  }

  @Test
  public void testCompany() {
    Optional<Company> c = FakerGen.create(Company.class);
    assertTrue(c.isPresent());
    c.ifPresent(co -> {
      assertNotNull(co.getBs());
      assertNotNull(co.getBuzzWord());
      assertNotNull(co.getIndustry());
      assertNotNull(co.getLogo());
      assertNotNull(co.getName());
      assertNotNull(co.getProfession());
      assertNotNull(co.getSuffix());
      assertNotNull(co.getUrl());
    });
  }

  @Test
  public void testCurrency() {
    Optional<Currency> c = FakerGen.create(Currency.class);
    assertTrue(c.isPresent());
    c.ifPresent( ch -> {
      assertNotNull(ch.getCode());
      assertNotNull(ch.getName());
    });
  }


  @Test
  public void testCommerce() {
    Optional<Commerce> c = FakerGen.create(Commerce.class);
    assertTrue(c.isPresent());
    c.ifPresent(co -> {
      assertNotNull(co.getColor());
      assertNotNull(co.getDepartment());
      assertNotNull(co.getProductName());
      assertNotNull(co.getMaterial());
      assertNotNull(co.getPrice());
      assertNotNull(co.getPromotionCode());
    });
  }

  @Test
  public void testColor() {
    Optional<Color> c = FakerGen.create(Color.class);
    assertTrue(c.isPresent());
    c.ifPresent( ch -> {
      assertNotNull(ch.getColor());
    });
  }

  @Test
  public void testMedical() {
    Optional<Medical> b = FakerGen.create(Medical.class);
    assertTrue(b.isPresent());
    b.ifPresent(bo -> {
      assertNotNull(bo.getMedicineName());
      assertNotNull(bo.getDiseaseName());
      assertNotNull(bo.getHospitalName());
      assertNotNull(bo.getSymptom());
    });
  }

  public void testLebowski() {
    Optional<Lebowski> c = FakerGen.create(Lebowski.class);
    assertTrue(c.isPresent());
    c.ifPresent(co -> {
      assertNotNull(co.getActor());
      assertNotNull(co.getCharacter());
      assertNotNull(co.getQuote());
    });
  }

  @Test
  public void testWeather() {
    Optional<Weather> c = FakerGen.create(Weather.class);
    assertTrue(c.isPresent());
    c.ifPresent(co -> {
      assertNotNull(co.getDescription());
      assertNotNull(co.getCelsius());
      assertNotNull(co.getFahrenheit());
    });
  }

  @Test
  public void testStarTrek() {
    Optional<StarTrek> c = FakerGen.create(StarTrek.class);
    assertTrue(c.isPresent());
    c.ifPresent(co -> {
      assertNotNull(co.getCharacter());
      assertNotNull(co.getLocation());
      assertNotNull(co.getSpecie());
      assertNotNull(co.getVillain());
    });
  }

  @Test
  public void testOverwatch() {
    Optional<Overwatch> c = FakerGen.create(Overwatch.class);
    assertTrue(c.isPresent());
    c.ifPresent(co -> {
      assertNotNull(co.getHero());
      assertNotNull(co.getLocation());
      assertNotNull(co.getQuote());
     });
   }

    public void testRickAndMorty() {
    Optional<RickAndMorty> r = FakerGen.create(RickAndMorty.class);
    assertTrue(r.isPresent());
    r.ifPresent(ro -> {
      assertNotNull(ro.getCharacter());
      assertNotNull(ro.getLocation());
      assertNotNull(ro.getQuote());
    });
  }

  @Test
  public void testTeam() {
    Optional<Team> t = FakerGen.create(Team.class);
    assertTrue(t.isPresent());
    t.ifPresent(to -> {
      assertNotNull(to.getName());
      assertNotNull(to.getCreature());
      assertNotNull(to.getState());
      assertNotNull(to.getSport());
    });
  }
}