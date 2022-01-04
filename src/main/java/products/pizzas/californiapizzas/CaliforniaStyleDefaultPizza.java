package products.pizzas.californiapizzas;

import enums.CaliforniaStylePizzaEnums;
import factories.ingredients.IngredientFactory;
import lombok.extern.log4j.Log4j2;
import products.ingredients.cheese.Cheese;
import products.ingredients.dough.Dough;
import products.ingredients.pepperoni.Pepperoni;
import products.ingredients.veggie.Veggie;
import products.pizzas.BasePizza;

import java.util.List;

@Log4j2
public class CaliforniaStyleDefaultPizza extends BasePizza {

    public CaliforniaStyleDefaultPizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory, CaliforniaStylePizzaEnums.CALIFORNIA_STYLE_DEFAULT_PIZZA.name());
    }

    @Override
    public void prepare() {
        log.info("Preparing {}", getName());
        final Dough dough = getIngredientFactory().createDough();
        final Cheese cheese = getIngredientFactory().createCheese();
        final Pepperoni pepperoni = getIngredientFactory().createPepperoni();
        final List<Veggie> veggies = getIngredientFactory().createVeggies();
        getIngredientList().add(dough);
        getIngredientList().add(cheese);
        getIngredientList().add(pepperoni);
        getIngredientList().addAll(veggies);
    }
}
