package products.pizzas.chicagopizzas;

import enums.ChicagoStylePizzaEnums;
import factories.ingredients.IngredientFactory;
import lombok.extern.log4j.Log4j2;
import products.ingredients.cheese.Cheese;
import products.ingredients.dough.Dough;
import products.pizzas.BasePizza;

@Log4j2
public class ChicagoStyleCheesePizza extends BasePizza {
    public ChicagoStyleCheesePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory, ChicagoStylePizzaEnums.CHICAGO_STYLE_CHEESE_PIZZA.name());
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
