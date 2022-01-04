package factories.stores;

import enums.CaliforniaStylePizzaEnums;
import factories.ingredients.CaliforniaIngredientFactory;
import products.pizzas.Pizza;
import products.pizzas.californiapizzas.*;

import java.util.Objects;

public class CaliforniaPizzaStore extends AbstractPizzaStore {
    public CaliforniaPizzaStore() {
        super(new CaliforniaIngredientFactory());
    }

    @Override
    protected Pizza createPizza(String pizzaType) {
        if (Objects.equals(pizzaType, CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_CHEESE_PIZZA.name())) return new CaliforniaStyleCheesePizza(getIngredientFactory());
        if (Objects.equals(pizzaType, CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_CLAM_PIZZA.name())) return new CaliforniaStyleClamPizza(getIngredientFactory());
        if (Objects.equals(pizzaType, CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_PEPPERONI_PIZZA.name())) return new CaliforniaStylePepperoniPizza(getIngredientFactory());
        if (Objects.equals(pizzaType, CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_VEGGIE_PIZZA.name())) return new CaliforniaStyleVeggiePizza(getIngredientFactory());
        return new CaliforniaStyleDefaultPizza(getIngredientFactory());
    }
}
