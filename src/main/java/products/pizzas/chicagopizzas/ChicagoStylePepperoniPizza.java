package products.pizzas.chicagopizzas;

import enums.ChicagoStylePizzaEnums;
import factories.ingredients.IngredientFactory;
import lombok.extern.log4j.Log4j2;
import products.ingredients.dough.Dough;
import products.ingredients.pepperoni.Pepperoni;
import products.pizzas.BasePizza;

@Log4j2
public class ChicagoStylePepperoniPizza extends BasePizza {
    public ChicagoStylePepperoniPizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory, ChicagoStylePizzaEnums.CHICAGO_STYLE_PEPPERONI_PIZZA.name());
    }

    @Override
    public void prepare() {
        log.info("Preparing {}", getName());
        final Dough dough = getIngredientFactory().createDough();
        final Pepperoni pepperoni = getIngredientFactory().createPepperoni();
        getIngredientList().add(dough);
        getIngredientList().add(pepperoni);
    }
}
