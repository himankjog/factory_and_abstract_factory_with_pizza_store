package products.ingredients.dough;

import lombok.AllArgsConstructor;
import lombok.Getter;
import products.ingredients.Ingredient;

@Getter
@AllArgsConstructor
public abstract class Dough implements Ingredient {
    private final DoughType doughType;
    private final String name;

    @Override
    public Dough getInstance() {
        getDoughDescription();
        return this;
    }

    protected abstract void getDoughDescription();
}
