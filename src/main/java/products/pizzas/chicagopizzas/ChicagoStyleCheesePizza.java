package products.pizzas.chicagopizzas;

import enums.ChicagoStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class ChicagoStyleCheesePizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing ChicagoStyleCheesePizza");
    }

    @Override
    public void bake() {
        log.info("Baking ChicagoStyleCheesePizza");
    }

    @Override
    public void cut() {
        log.info("Cutting ChicagoStyleCheesePizza");
    }

    @Override
    public void pack() {
        log.info("Packing ChicagoStyleCheesePizza");
    }

    @Override
    public String getName() {
        return ChicagoStylePizzaEnums.CHICAGO_STYLE_CHEESE_PIZZA.name();
    }
}
