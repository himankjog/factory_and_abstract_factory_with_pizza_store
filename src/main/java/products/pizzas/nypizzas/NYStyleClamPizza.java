package products.pizzas.nypizzas;

import enums.NYStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class NYStyleClamPizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing NYStyleClamPizza");
    }

    @Override
    public void bake() {
        log.info("Baking NYStyleClamPizza");
    }

    @Override
    public void cut() {
        log.info("Cutting NYStyleClamPizza");
    }

    @Override
    public void pack() {
        log.info("Packing NYStyleClamPizza");
    }

    @Override
    public String getName() {
        return NYStylePizzaEnums.NY_STYLE_CLAM_PIZZA.name();
    }
}
