package factories.stores;

import enums.ChicagoStylePizzaEnums;
import factories.ingredients.ChicagoIngredientFactory;
import products.pizzas.Pizza;
import products.pizzas.chicagopizzas.*;

import java.util.Objects;

public class ChicagoPizzaStore extends AbstractPizzaStore {
    public ChicagoPizzaStore() {
        super(new ChicagoIngredientFactory());
    }

    @Override
    protected Pizza createPizza(String pizzaType) {
        if (Objects.equals(pizzaType, ChicagoStylePizzaEnums.CHICAGO_STYLE_CHEESE_PIZZA.name())) return new ChicagoStyleCheesePizza(getIngredientFactory());
        if (Objects.equals(pizzaType, ChicagoStylePizzaEnums.CHICAGO_STYLE_CLAM_PIZZA.name())) return new ChicagoStyleClamPizza(getIngredientFactory());
        if (Objects.equals(pizzaType, ChicagoStylePizzaEnums.CHICAGO_STYLE_PEPPERONI_PIZZA.name())) return new ChicagoStylePepperoniPizza(getIngredientFactory());
        if (Objects.equals(pizzaType, ChicagoStylePizzaEnums.CHICAGO_STYLE_VEGGIE_PIZZA.name())) return new ChicagoStyleVeggiePizza(getIngredientFactory());
        return new ChicagoStyleDefaultPizza(getIngredientFactory());
    }
}
