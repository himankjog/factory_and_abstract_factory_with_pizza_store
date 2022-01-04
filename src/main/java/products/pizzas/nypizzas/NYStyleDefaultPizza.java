package products.pizzas.nypizzas;

import enums.NYStylePizzaEnums;
import factories.ingredients.IngredientFactory;
import lombok.extern.log4j.Log4j2;
import products.ingredients.cheese.Cheese;
import products.ingredients.dough.Dough;
import products.ingredients.pepperoni.Pepperoni;
import products.pizzas.BasePizza;

@Log4j2
public class NYStyleDefaultPizza extends BasePizza {

    public NYStyleDefaultPizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory, NYStylePizzaEnums.NY_STYLE_DEFAULT_PIZZA.name());
    }

    @Override
    public void prepare() {
        log.info("Preparing {}", getName());
        final Dough dough = getIngredientFactory().createDough();
        final Pepperoni pepperoni = getIngredientFactory().createPepperoni();
        final Cheese cheese = getIngredientFactory().createCheese();
        getIngredientList().add(dough);
        getIngredientList().add(pepperoni);
        getIngredientList().add(cheese);
    }
}
