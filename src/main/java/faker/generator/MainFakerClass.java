package faker.generator;

        import com.github.javafaker.Faker;

public class MainFakerClass {

    public static void main(String[] args) {
        Faker faker = new Faker();
        String medicineName = faker.medical().medicineName();
        System.out.println("Medicine Name " + medicineName);
    }

}
