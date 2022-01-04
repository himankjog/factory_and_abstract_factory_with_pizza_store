package factories.ingredients;

import products.ingredients.cheese.Cheddar;
import products.ingredients.cheese.Cheese;
import products.ingredients.clam.Clam;
import products.ingredients.clam.FrozenClam;
import products.ingredients.dough.Dough;
import products.ingredients.dough.ThickCrustDough;
import products.ingredients.pepperoni.CubedPepperoni;
import products.ingredients.pepperoni.Pepperoni;
import products.ingredients.veggie.Capsicum;
import products.ingredients.veggie.Olive;
import products.ingredients.veggie.Veggie;

import java.util.ArrayList;
import java.util.List;

public class ChicagoIngredientFactory implements IngredientFactory {
    @Override
    public Cheese createCheese() {
        final Cheese cheese = new Cheddar();
        return cheese.getInstance();
    }

    @Override
    public Clam createClam() {
        final Clam clam = new FrozenClam();
        return clam.getInstance();
    }

    @Override
    public Dough createDough() {
        final Dough dough = new ThickCrustDough();
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
        final Veggie capsicum = new Capsicum();
        final Veggie olive = new Olive();
        veggies.add(capsicum.getInstance());
        veggies.add(olive.getInstance());
        return veggies;
    }
}
