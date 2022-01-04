package products.pizzas.nypizzas;

import enums.NYStylePizzaEnums;
import factories.ingredients.IngredientFactory;
import lombok.extern.log4j.Log4j2;
import products.ingredients.cheese.Cheese;
import products.ingredients.dough.Dough;
import products.pizzas.BasePizza;

@Log4j2
public class NYStyleCheesePizza extends BasePizza {
    public NYStyleCheesePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory, NYStylePizzaEnums.NY_STYLE_CHEESE_PIZZA.name());
    }

    @Override
    public void prepare() {
        log.info("Preparing {}", getName());
        final Dough dough = getIngredientFactory().createDough();
        final Cheese cheese = getIngredientFactory().createCheese();
        getIngredientList().add(dough);
        getIngredientList().add(cheese);
    }
}
