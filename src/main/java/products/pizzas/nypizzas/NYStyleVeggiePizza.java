package products.pizzas.nypizzas;

import enums.NYStylePizzaEnums;
import factories.ingredients.IngredientFactory;
import lombok.extern.log4j.Log4j2;
import products.ingredients.dough.Dough;
import products.ingredients.veggie.Veggie;
import products.pizzas.BasePizza;

import java.util.List;


@Log4j2
public class NYStyleVeggiePizza extends BasePizza {
    public NYStyleVeggiePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory, NYStylePizzaEnums.NY_STYLE_VEGGIE_PIZZA.name());
    }

    @Override
    public void prepare() {
        log.info("Preparing {}", getName());
        final Dough dough = getIngredientFactory().createDough();
        final List<Veggie> veggies = getIngredientFactory().createVeggies();
        getIngredientList().add(dough);
        getIngredientList().addAll(veggies);
    }
}
