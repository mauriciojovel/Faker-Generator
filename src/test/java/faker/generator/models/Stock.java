package faker.generator.models;

import faker.generator.FakeStock;
import faker.generator.FakeStockType;
import lombok.Data;

@Data
public class Stock {

    @FakeStock(FakeStockType.NSDQ)
    private String nsdqSymbol;

    @FakeStock(FakeStockType.NYSE)
    private String nyseSymbol;
}
