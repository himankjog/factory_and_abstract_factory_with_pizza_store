package products.ingredients.pepperoni;

import lombok.AllArgsConstructor;
import lombok.Getter;
import products.ingredients.Ingredient;

@Getter
@AllArgsConstructor
public abstract class Pepperoni implements Ingredient {
    private final String name;
    private final PepperoniType pepperoniType;

    @Override
    public Pepperoni getInstance() {
        getPepperoniDescription();
        return this;
    }

    protected abstract void getPepperoniDescription();
}
