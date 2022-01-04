package products.pizzas.chicagopizzas;

import enums.ChicagoStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.Pizza;

@Log4j2
@Builder
public class ChicagoStyleClamPizza implements Pizza {
    @Override
    public void prepare() {
        log.info("Preparing ChicagoStyleClamPizza");
    }

    @Override
    public void bake() {
        log.info("Baking ChicagoStyleClamPizza");
    }

    @Override
    public void cut() {
        log.info("Cutting ChicagoStyleClamPizza");
    }

    @Override
    public void pack() {
        log.info("Packing ChicagoStyleClamPizza");
    }

    @Override
    public String getName() {
        return ChicagoStylePizzaEnums.CHICAGO_STYLE_CLAM_PIZZA.name();
    }
}
