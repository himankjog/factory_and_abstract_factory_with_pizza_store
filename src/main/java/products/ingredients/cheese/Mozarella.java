package products.ingredients.cheese;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Mozarella extends Cheese {
    private static final String NAME = "MOZARELLA";

    public Mozarella() {
        super(NAME);
    }

    @Override
    protected void getDescription() {
        log.info("Using the most used cheese: {}", getName());
    }
}
