package products.pizzas.nypizzas;

import enums.NYStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.BasePizza;

@Log4j2
@Builder
public class NYStyleDefaultPizza extends BasePizza {

    @Override
    public void prepare() {
        log.info("Preparing NYStyleDefaultPizza");
    }

    @Override
    public void bake() {
        log.info("Baking NYStyleDefaultPizza");
    }

    @Override
    public void cut() {
        log.info("Cutting NYStyleDefaultPizza");
    }

    @Override
    public void pack() {
        log.info("Packing NYStyleDefaultPizza");
    }

    @Override
    public String getName() {
        return NYStylePizzaEnums.NY_STYLE_DEFAULT_PIZZA.name();
    }
}
