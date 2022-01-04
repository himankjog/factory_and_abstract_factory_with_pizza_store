package products.pizzas.californiapizzas;

import enums.CaliforniaStylePizzaEnums;
import factories.ingredients.IngredientFactory;
import lombok.extern.log4j.Log4j2;
import products.ingredients.cheese.Cheese;
import products.ingredients.dough.Dough;
import products.pizzas.BasePizza;

@Log4j2
public class CaliforniaStyleCheesePizza extends BasePizza {
    public CaliforniaStyleCheesePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory, CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_CHEESE_PIZZA.name());
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
