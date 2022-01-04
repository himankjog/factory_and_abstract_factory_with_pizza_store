package factories.stores;

import factories.ingredients.IngredientFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import products.pizzas.Pizza;

@Getter
@AllArgsConstructor
public abstract class AbstractPizzaStore implements PizzaStore {
    private final IngredientFactory ingredientFactory;

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
