package products.pizzas.californiapizzas;

import enums.CaliforniaStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.BasePizza;

@Log4j2
@Builder
public class CaliforniaStyleDefaultPizza extends BasePizza {

    @Override
    public void prepare() {
        log.info("Preparing CaliforniaStyleDefaultPizza");
    }

    @Override
    public void bake() {
        log.info("Baking CaliforniaStyleDefaultPizza");
    }

    @Override
    public void cut() {
        log.info("Cutting CaliforniaStyleDefaultPizza");
    }

    @Override
    public void pack() {
        log.info("Packing CaliforniaStyleDefaultPizza");
    }

    @Override
    public String getName() {
        return CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_DEFAULT_PIZZA.name();
    }
}
