package products.pizzas.chicagopizzas;

import enums.ChicagoStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class ChicagoStyleVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing ChicagoStyleVeggiePizza");
    }

    @Override
    public void bake() {
        log.info("Baking ChicagoStyleVeggiePizza");
    }

    @Override
    public void cut() {
        log.info("Cutting ChicagoStyleVeggiePizza");
    }

    @Override
    public void pack() {
        log.info("Packing ChicagoStyleVeggiePizza");
    }

    @Override
    public String getName() {
        return ChicagoStylePizzaEnums.CHICAGO_STYLE_VEGGIE_PIZZA.name();
    }
}
