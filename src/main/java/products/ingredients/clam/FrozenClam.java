package products.ingredients.clam;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FrozenClam extends Clam {
    private static final ClamType CLAM_TYPE = ClamType.FROZEN;
    private static final String NAME = "XYZ FROZEN CLAM";
    public FrozenClam() {
        super(CLAM_TYPE, NAME);
    }
    @Override
    protected void getDescription() {
        log.info("Got {} of type: {}", getName(), getClamType().name());
    }
}
