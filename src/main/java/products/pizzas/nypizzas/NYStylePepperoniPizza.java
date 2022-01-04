package products.pizzas.nypizzas;

import enums.NYStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class NYStylePepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing NYStylePepperoniPizza");
    }

    @Override
    public void bake() {
        log.info("Baking NYStylePepperoniPizza");
    }

    @Override
    public void cut() {
        log.info("Cutting NYStylePepperoniPizza");
    }

    @Override
    public void pack() {
        log.info("Packing NYStylePepperoniPizza");
    }

    @Override
    public String getName() {
        return NYStylePizzaEnums.NY_STYLE_PEPPERONI_PIZZA.name();
    }
}
