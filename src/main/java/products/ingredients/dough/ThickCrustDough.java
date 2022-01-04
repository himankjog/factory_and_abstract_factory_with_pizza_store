package products.ingredients.dough;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ThickCrustDough extends Dough {
    private static final DoughType DOUGH_TYPE = DoughType.THICK_CRUST;
    private static final String NAME = "123 Thick Crust Dough";

    public ThickCrustDough() {
        super(DOUGH_TYPE, NAME);
    }

    @Override
    protected void getDoughDescription() {
        log.info("For the fluffy feel we have {} type dough.", getDoughType());
    }
}
