package products.ingredients.pepperoni;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CubedPepperoni extends Pepperoni {
    private static final String NAME = "DECENT CUBED PEPPERONI";
    private static final PepperoniType PEPPERONI_TYPE = PepperoniType.CUBED;

    public CubedPepperoni() {
        super(NAME, PEPPERONI_TYPE);
    }

    @Override
    protected void getPepperoniDescription() {
        log.info("Using pepperoni: {} of type: {}", getName(), getPepperoniType());
    }
}
