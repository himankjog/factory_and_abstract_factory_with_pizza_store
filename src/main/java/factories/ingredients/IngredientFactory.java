package factories.ingredients;

import products.ingredients.cheese.Cheese;
import products.ingredients.clam.Clam;
import products.ingredients.dough.Dough;
import products.ingredients.pepperoni.Pepperoni;
import products.ingredients.veggie.Veggie;

import java.util.List;

public interface IngredientFactory {
    Cheese createCheese();
    Clam createClam();
    Dough createDough();
    Pepperoni createPepperoni();
    List<Veggie> createVeggies();
}
