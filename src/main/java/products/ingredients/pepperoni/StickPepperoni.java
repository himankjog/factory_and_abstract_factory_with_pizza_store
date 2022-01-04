package products.ingredients.pepperoni;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StickPepperoni extends Pepperoni {
    private static final String NAME = "STAR STICK PEPPERONI";
    private static final PepperoniType PEPPERONI_TYPE = PepperoniType.STICK;

    public StickPepperoni() {
        super(NAME, PEPPERONI_TYPE);
    }

    @Override
    protected void getPepperoniDescription() {
        log.info("Using the pepperoni: {} of type: {}", getName(), getPepperoniType());
    }
}
