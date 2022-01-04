package products.pizzas.nypizzas;

import enums.NYStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.BasePizza;

@Log4j2
@Builder
public class NYStyleCheesePizza extends BasePizza {
    @Override
    public void prepare() {
        log.info("Preparing NYStyleCheesePizza");
    }

    @Override
    public void bake() {
        log.info("Baking NYStyleCheesePizza");
    }

    @Override
    public void cut() {
        log.info("Cutting NYStyleCheesePizza");
    }

    @Override
    public void pack() {
        log.info("Packing NYStyleCheesePizza");
    }

    @Override
    public String getName() {
        return NYStylePizzaEnums.NY_STYLE_CHEESE_PIZZA.name();
    }
}
