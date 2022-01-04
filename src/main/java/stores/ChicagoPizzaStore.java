package stores;

import enums.ChicagoStylePizzaEnums;
import lombok.Builder;
import products.pizzas.Pizza;
import products.pizzas.chicagopizzas.*;

import java.util.Objects;

@Builder
public class ChicagoPizzaStore extends AbstractPizzaStore {
    @Override
    protected Pizza createPizza(String pizzaType) {
        if (Objects.equals(pizzaType, ChicagoStylePizzaEnums.CHICAGO_STYLE_CHEESE_PIZZA.name())) return ChicagoStyleCheesePizza.builder().build();
        if (Objects.equals(pizzaType, ChicagoStylePizzaEnums.CHICAGO_STYLE_CLAM_PIZZA.name())) return ChicagoStyleClamPizza.builder().build();
        if (Objects.equals(pizzaType, ChicagoStylePizzaEnums.CHICAGO_STYLE_PEPPERONI_PIZZA.name())) return ChicagoStylePepperoniPizza.builder().build();
        if (Objects.equals(pizzaType, ChicagoStylePizzaEnums.CHICAGO_STYLE_VEGGIE_PIZZA.name())) return ChicagoStyleVeggiePizza.builder().build();
        return ChicagoStyleDefaultPizza.builder().build();
    }
}
