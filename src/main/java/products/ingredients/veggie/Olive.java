package products.ingredients.veggie;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Olive extends Veggie {
    private static final String NAME = "Black Olive";

    public Olive() {
        super(NAME);
    }

    @Override
    protected void getVeggieDescription() {
        log.info("Using topping: {}", getName());
    }
}
