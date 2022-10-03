package plants;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class CactusTest extends TestCase {

    Cactus c = new Cactus("ubbe", 20);
    Cactus d = new Cactus("ge", 2000000000);

    @Test
    void calculateLiquid() {
        assert(c.calculateLiquid() == 0.02);
        assert(d.calculateLiquid() == 0.02);
    }

    @Test
    void getLiquid() {
        assert(Objects.equals(c.getLiquid(), "Mineralvatten"));
        assert(!Objects.equals(c.getLiquid(), "Protein dryck"));
        assert(!Objects.equals(c.getLiquid(), "Kranvatten"));
    }
}