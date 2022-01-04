package products.ingredients.dough;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ThinCrustDough extends Dough {
    private static final DoughType DOUGH_TYPE = DoughType.THIN_CRUST;
    private static final String NAME = "PQR Thin Crust Dough";

    public ThinCrustDough() {
        super(DOUGH_TYPE, NAME);
    }

    @Override
    protected void getDoughDescription() {
        log.info("This is a {} dough and its name is {}", getDoughType().name(), getName());
    }
}
