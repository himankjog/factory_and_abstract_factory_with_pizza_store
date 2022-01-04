package factories.ingredients;

import products.ingredients.cheese.Cheese;
import products.ingredients.cheese.Mozarella;
import products.ingredients.clam.Clam;
import products.ingredients.clam.FreshClam;
import products.ingredients.dough.Dough;
import products.ingredients.dough.ThickCrustDough;
import products.ingredients.pepperoni.Pepperoni;
import products.ingredients.pepperoni.StickPepperoni;
import products.ingredients.veggie.Capsicum;
import products.ingredients.veggie.Onion;
import products.ingredients.veggie.Veggie;

import java.util.ArrayList;
import java.util.List;

public class NYIngredientFactory implements IngredientFactory {
    @Override
    public Cheese createCheese() {
        final Cheese cheese = new Mozarella();
        return cheese.getInstance();
    }

    @Override
    public Clam createClam() {
        final Clam clam = new FreshClam();
        return clam.getInstance();
    }

    @Override
    public Dough createDough() {
        final Dough dough = new ThickCrustDough();
        return dough.getInstance();
    }

    @Override
    public Pepperoni createPepperoni() {
        final Pepperoni pepperoni = new StickPepperoni();
        return pepperoni.getInstance();
    }

    @Override
    public List<Veggie> createVeggies() {
        List<Veggie> veggies = new ArrayList<>();
        final Veggie capsicum = new Capsicum();
        final Veggie onion = new Onion();
        veggies.add(capsicum.getInstance());
        veggies.add(onion.getInstance());
        return veggies;
    }
}
