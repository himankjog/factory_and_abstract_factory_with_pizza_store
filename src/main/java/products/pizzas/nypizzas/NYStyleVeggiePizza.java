package products.pizzas.nypizzas;

import enums.NYStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class NYStyleVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing NYStyleVeggiePizza");
    }

    @Override
    public void bake() {
        log.info("Baking NYStyleVeggiePizza");
    }

    @Override
    public void cut() {
        log.info("Cutting NYStyleVeggiePizza");
    }

    @Override
    public void pack() {
        log.info("Packing NYStyleVeggiePizza");
    }

    @Override
    public String getName() {
        return NYStylePizzaEnums.NY_STYLE_VEGGIE_PIZZA.name();
    }
}
