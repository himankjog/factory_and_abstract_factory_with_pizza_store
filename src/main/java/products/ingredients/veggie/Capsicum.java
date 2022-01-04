package products.ingredients.veggie;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Capsicum extends Veggie {
    private static final String NAME = "GREEN CAPSICUM";

    public Capsicum() {
        super(NAME);
    }

    @Override
    protected void getVeggieDescription() {
        log.info("Using capsicum: {}", getName());
    }
}
