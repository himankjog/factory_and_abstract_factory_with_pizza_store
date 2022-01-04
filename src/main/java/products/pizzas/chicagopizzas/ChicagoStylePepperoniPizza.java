package products.pizzas.chicagopizzas;

import enums.ChicagoStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class ChicagoStylePepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing ChicagoStylePepperoniPizza");
    }

    @Override
    public void bake() {
        log.info("Baking ChicagoStylePepperoniPizza");
    }

    @Override
    public void cut() {
        log.info("Cutting ChicagoStylePepperoniPizza");
    }

    @Override
    public void pack() {
        log.info("Packing ChicagoStylePepperoniPizza");
    }

    @Override
    public String getName() {
        return ChicagoStylePizzaEnums.CHICAGO_STYLE_PEPPERONI_PIZZA.name();
    }
}
