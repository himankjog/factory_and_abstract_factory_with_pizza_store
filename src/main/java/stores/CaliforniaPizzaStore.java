package stores;

import enums.CaliforniaStylePizzaEnums;
import lombok.Builder;
import products.pizzas.Pizza;
import products.pizzas.californiapizzas.*;

import java.util.Objects;

@Builder
public class CaliforniaPizzaStore extends AbstractPizzaStore {
    @Override
    protected Pizza createPizza(String pizzaType) {
        if (Objects.equals(pizzaType, CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_CHEESE_PIZZA.name())) return CaliforniaStyleCheesePizza.builder().build();
        if (Objects.equals(pizzaType, CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_CLAM_PIZZA.name())) return CaliforniaStyleClamPizza.builder().build();
        if (Objects.equals(pizzaType, CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_PEPPERONI_PIZZA.name())) return CaliforniaStylePepperoniPizza.builder().build();
        if (Objects.equals(pizzaType, CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_VEGGIE_PIZZA.name())) return CaliforniaStyleVeggiePizza.builder().build();
        return CaliforniaStyleDefaultPizza.builder().build();
    }
}
