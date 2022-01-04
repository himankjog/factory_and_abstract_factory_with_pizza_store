package products.pizzas.californiapizzas;

import enums.CaliforniaStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class CaliforniaStyleCheesePizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing CaliforniaStyleCheesePizza");
    }

    @Override
    public void bake() {
        log.info("Baking CaliforniaStyleCheesePizza");
    }

    @Override
    public void cut() {
        log.info("Cutting CaliforniaStyleCheesePizza");
    }

    @Override
    public void pack() {
        log.info("Packing CaliforniaStyleCheesePizza");
    }

    @Override
    public String getName() {
        return CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_CHEESE_PIZZA.name();
    }
}
