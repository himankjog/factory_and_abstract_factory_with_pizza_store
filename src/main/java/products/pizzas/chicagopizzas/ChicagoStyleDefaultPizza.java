package products.pizzas.chicagopizzas;

import enums.ChicagoStylePizzaEnums;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import products.pizzas.BasePizza;

@Log4j2
@Builder
public class ChicagoStyleDefaultPizza extends BasePizza {

    @Override
    public void prepare() {
        log.info("Preparing ChicagoStyleDefaultPizza");
    }

    @Override
    public void bake() {
        log.info("Baking ChicagoStyleDefaultPizza");
    }

    @Override
    public void cut() {
        log.info("Cutting ChicagoStyleDefaultPizza");
    }

    @Override
    public void pack() {
        log.info("Packing ChicagoStyleDefaultPizza");
    }

    @Override
    public String getName() {
        return ChicagoStylePizzaEnums.CHICAGO_STYLE_DEFAULT_PIZZA.name();
    }
}
