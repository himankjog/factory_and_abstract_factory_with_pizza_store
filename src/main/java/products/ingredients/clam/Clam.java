package products.ingredients.clam;

import lombok.AllArgsConstructor;
import lombok.Getter;
import products.ingredients.Ingredient;

@Getter
@AllArgsConstructor
public abstract class Clam implements Ingredient {
    private final ClamType clamType;
    private final String name;

    @Override
    public Clam getInstance() {
        getDescription();
        return this;
    }

    protected abstract void getDescription();
}
