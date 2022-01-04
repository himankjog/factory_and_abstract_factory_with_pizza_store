package factories.stores;

import products.pizzas.Pizza;

public interface PizzaStore {
    Pizza orderPizza(final String pizzaType);
}
