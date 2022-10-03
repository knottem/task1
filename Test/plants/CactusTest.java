package plants;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class CactusTest extends TestCase {

    public Cactus cactus = new Cactus("ubbe", 20);

    @Test
    void calculateLiquid() {
        assert(cactus.calculateLiquid() == 0.02);
    }

    @Test
    void getLiquid() {
        assert(Objects.equals(cactus.getLiquid(), "Mineralvatten"));
        assert(!Objects.equals(cactus.getLiquid(), "Protein dryck"));
        assert(!Objects.equals(cactus.getLiquid(), "Kranvatten"));
    }
}