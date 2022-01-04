package products.ingredients.veggie;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Onion extends Veggie {
    private static final String NAME = "WHITE ONION";

    public Onion() {
        super(NAME);
    }

    @Override
    protected void getVeggieDescription() {
        log.info("Getting Onion: {}", getName());
    }
}
