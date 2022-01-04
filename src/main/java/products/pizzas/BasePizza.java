package products.pizzas;

import factories.ingredients.IngredientFactory;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import products.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Getter
public abstract class BasePizza implements Pizza {
    private final List<Ingredient> ingredientList;
    private final IngredientFactory ingredientFactory;
    private final String name;

    protected BasePizza(final IngredientFactory ingredientFactory, final String name) {
        this.ingredientFactory = ingredientFactory;
        this.name = name;
        this.ingredientList = new ArrayList<>();
    }


    @Override
    public void bake() {
        log.info("Baking pizza: {}", getName());
    }

    @Override
    public void cut() {
        log.info("Cutting pizza: {}", getName());
    }

    @Override
    public void pack() {
        log.info("Packing pizza: {}", getName());
    }
}
