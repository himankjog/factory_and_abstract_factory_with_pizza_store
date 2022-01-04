package products.ingredients.clam;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FreshClam extends Clam {
    private static final ClamType CLAM_TYPE = ClamType.FRESH;
    private static final String NAME = "ABC FRESH CLAM";
    public FreshClam() {
        super(CLAM_TYPE, NAME);
    }

    @Override
    protected void getDescription() {
        log.info("Got a clam: {} of type: {}", getName(), getClamType().name());
    }
}
