package products.ingredients.cheese;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Cheddar extends Cheese {
    private static final String NAME = "CHEDDAR";
    public Cheddar() {
        super(NAME);
    }

    @Override
    protected void getDescription() {
        log.info("Using the extra chewy cheese: {}", getName());
    }
}
