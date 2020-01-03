package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeStockType {
    NSDQ("stock.symbol_nsdq"), NYSE("stock.symbol_nyse");
    private String fakerKey;
}
