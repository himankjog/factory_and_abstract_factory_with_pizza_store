package products.pizzas.chicagopizzas;

import enums.ChicagoStylePizzaEnums;
import factories.ingredients.IngredientFactory;
import lombok.extern.log4j.Log4j2;
import products.ingredients.cheese.Cheese;
import products.ingredients.dough.Dough;
import products.ingredients.pepperoni.Pepperoni;
import products.pizzas.BasePizza;

@Log4j2
public class ChicagoStyleDefaultPizza extends BasePizza {

    public ChicagoStyleDefaultPizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory, ChicagoStylePizzaEnums.CHICAGO_STYLE_DEFAULT_PIZZA.name());
    }

    @Override
    public void prepare() {
        log.info("Preparing {}", getName());
        final Dough dough = getIngredientFactory().createDough();
        final Cheese cheese = getIngredientFactory().createCheese();
        final Pepperoni pepperoni = getIngredientFactory().createPepperoni();
        getIngredientList().add(dough);
        getIngredientList().add(cheese);
        getIngredientList().add(pepperoni);
    }
}
