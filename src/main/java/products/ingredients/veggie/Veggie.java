package products.ingredients.veggie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import products.ingredients.Ingredient;

@Getter
@AllArgsConstructor
public abstract class Veggie implements Ingredient {
    private final String name;

    @Override
    public Veggie getInstance() {
        getVeggieDescription();
        return this;
    }

    protected abstract void getVeggieDescription();
}
