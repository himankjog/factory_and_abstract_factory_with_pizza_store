package products.pizzas.californiapizzas;

import enums.CaliforniaStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class CaliforniaStyleClamPizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing CaliforniaStyleClamPizza");
    }

    @Override
    public void bake() {
        log.info("Baking CaliforniaStyleClamPizza");
    }

    @Override
    public void cut() {
        log.info("Cutting CaliforniaStyleClamPizza");
    }

    @Override
    public void pack() {
        log.info("Packing CaliforniaStyleClamPizza");
    }

    @Override
    public String getName() {
        return CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_CLAM_PIZZA.name();
    }
}
