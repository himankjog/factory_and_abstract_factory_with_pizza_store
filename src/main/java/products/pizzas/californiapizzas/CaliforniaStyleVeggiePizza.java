package products.pizzas.californiapizzas;

import enums.CaliforniaStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class CaliforniaStyleVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing CaliforniaStyleVeggiePizza");
    }

    @Override
    public void bake() {
        log.info("Baking CaliforniaStyleVeggiePizza");
    }

    @Override
    public void cut() {
        log.info("Cutting CaliforniaStyleVeggiePizza");
    }

    @Override
    public void pack() {
        log.info("Packing CaliforniaStyleVeggiePizza");
    }

    @Override
    public String getName() {
        return CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_VEGGIE_PIZZA.name();
    }
}
