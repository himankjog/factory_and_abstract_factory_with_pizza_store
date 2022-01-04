package products.pizzas.californiapizzas;

import enums.CaliforniaStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class CaliforniaStylePepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing CaliforniaStylePepperoniPizza");
    }

    @Override
    public void bake() {
        log.info("Baking CaliforniaStylePepperoniPizza");
    }

    @Override
    public void cut() {
        log.info("Cutting CaliforniaStylePepperoniPizza");
    }

    @Override
    public void pack() {
        log.info("Packing CaliforniaStylePepperoniPizza");
    }

    @Override
    public String getName() {
        return CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_PEPPERONI_PIZZA.name();
    }
}
