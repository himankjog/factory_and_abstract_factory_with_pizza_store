package stores;

import products.pizzas.Pizza;

public abstract class AbstractPizzaStore implements PizzaStore {
    @Override
    public Pizza orderPizza(final String pizzaType) {
        final Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;
    }

    protected abstract Pizza createPizza(final String pizzaType);
}
