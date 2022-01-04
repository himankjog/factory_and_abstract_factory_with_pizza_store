package products.pizzas.chicagopizzas;

import enums.ChicagoStylePizzaEnums;
import factories.ingredients.IngredientFactory;
import lombok.extern.log4j.Log4j2;
import products.ingredients.clam.Clam;
import products.ingredients.dough.Dough;
import products.pizzas.BasePizza;

@Log4j2
public class ChicagoStyleClamPizza extends BasePizza {
    public ChicagoStyleClamPizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory, ChicagoStylePizzaEnums.CHICAGO_STYLE_CLAM_PIZZA.name());
    }

    @Override
    public void prepare() {
        log.info("Preparing {}", getName());
        final Dough dough = getIngredientFactory().createDough();
        final Clam clam = getIngredientFactory().createClam();
        getIngredientList().add(dough);
        getIngredientList().add(clam);
    }
}
