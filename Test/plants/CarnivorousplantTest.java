package plants;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousplantTest extends TestCase {

    Carnivorousplant p = new Carnivorousplant("George", 70);

    @Test
    void calculateLiquid() {
        assert(p.calculateLiquid() == 0.24);
    }

    @Test
    void getLiquid() {
        assert(!Objects.equals(p.getLiquid(), "Mineralvatten"));
        assert(Objects.equals(p.getLiquid(), "Protein dryck"));
        assert(!Objects.equals(p.getLiquid(), "Kranvatten"));
    }
}