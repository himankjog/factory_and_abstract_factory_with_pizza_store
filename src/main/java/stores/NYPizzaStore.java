package stores;

import enums.NYStylePizzaEnums;
import lombok.Builder;
import products.pizzas.Pizza;
import products.pizzas.nypizzas.*;

import java.util.Objects;

@Builder
public class NYPizzaStore extends AbstractPizzaStore {
    @Override
    protected Pizza createPizza(String pizzaType) {
        if (Objects.equals(pizzaType, NYStylePizzaEnums.NY_STYLE_CHEESE_PIZZA.name())) return NYStyleCheesePizza.builder().build();
        if (Objects.equals(pizzaType, NYStylePizzaEnums.NY_STYLE_CLAM_PIZZA.name())) return NYStyleClamPizza.builder().build();
        if (Objects.equals(pizzaType, NYStylePizzaEnums.NY_STYLE_PEPPERONI_PIZZA.name())) return NYStylePepperoniPizza.builder().build();
        if (Objects.equals(pizzaType, NYStylePizzaEnums.NY_STYLE_VEGGIE_PIZZA.name())) return NYStyleVeggiePizza.builder().build();
        return NYStyleDefaultPizza.builder().build();
    }
}
