package factories.stores;

import enums.NYStylePizzaEnums;
import factories.ingredients.NYIngredientFactory;
import products.pizzas.Pizza;
import products.pizzas.nypizzas.*;

import java.util.Objects;

public class NYPizzaStore extends AbstractPizzaStore {
    public NYPizzaStore() {
        super(new NYIngredientFactory());
    }

    @Override
    protected Pizza createPizza(String pizzaType) {
        if (Objects.equals(pizzaType, NYStylePizzaEnums.NY_STYLE_CHEESE_PIZZA.name())) return new NYStyleCheesePizza(getIngredientFactory());
        if (Objects.equals(pizzaType, NYStylePizzaEnums.NY_STYLE_CLAM_PIZZA.name())) return new NYStyleClamPizza(getIngredientFactory());
        if (Objects.equals(pizzaType, NYStylePizzaEnums.NY_STYLE_PEPPERONI_PIZZA.name())) return new NYStylePepperoniPizza(getIngredientFactory());
        if (Objects.equals(pizzaType, NYStylePizzaEnums.NY_STYLE_VEGGIE_PIZZA.name())) return new NYStyleVeggiePizza(getIngredientFactory());
        return new NYStyleDefaultPizza(getIngredientFactory());
    }
}
