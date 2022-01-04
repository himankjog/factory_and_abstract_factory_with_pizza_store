package factories.ingredients;

import products.ingredients.cheese.Cheese;
import products.ingredients.cheese.Mozarella;
import products.ingredients.clam.Clam;
import products.ingredients.clam.FrozenClam;
import products.ingredients.dough.Dough;
import products.ingredients.dough.ThinCrustDough;
import products.ingredients.pepperoni.CubedPepperoni;
import products.ingredients.pepperoni.Pepperoni;
import products.ingredients.veggie.Olive;
import products.ingredients.veggie.Onion;
import products.ingredients.veggie.Veggie;

import java.util.ArrayList;
import java.util.List;

public class CaliforniaIngredientFactory implements IngredientFactory {
    @Override
    public Cheese createCheese() {
        final Cheese cheese = new Mozarella();
        return cheese.getInstance();
    }

    @Override
    public Clam createClam() {
        final Clam clam = new FrozenClam();
        return clam.getInstance();
    }

    @Override
    public Dough createDough() {
        final Dough dough = new ThinCrustDough();
        return dough.getInstance();
    }

    @Override
    public Pepperoni createPepperoni() {
        final Pepperoni pepperoni = new CubedPepperoni();
        return pepperoni.getInstance();
    }

    @Override
    public List<Veggie> createVeggies() {
        List<Veggie> veggies = new ArrayList<>();
        final Veggie olive = new Olive();
        final Veggie onion = new Onion();
        veggies.add(olive.getInstance());
        veggies.add(onion.getInstance());
        return veggies;
    }
}
