package products.ingredients.cheese;

import lombok.AllArgsConstructor;
import lombok.Getter;
import products.ingredients.Ingredient;

@Getter
@AllArgsConstructor
public abstract class Cheese implements Ingredient {
    private final String name;

    @Override
    public Cheese getInstance() {
        getDescription();
        return this;
    }

    protected abstract void getDescription();
}
