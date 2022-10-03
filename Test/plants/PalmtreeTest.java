package plants;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.Objects;


class PalmtreeTest extends TestCase {

    Palmtree palmtree = new Palmtree("Ubbe", 500);

    @Test
    void calculateLiquid() {
        assert(palmtree.calculateLiquid() == 2.5);
    }

    @Test
    void getLiquid() {
        assert(!Objects.equals(palmtree.getLiquid(), "Mineralvatten"));
        assert(!Objects.equals(palmtree.getLiquid(), "Protein dryck"));
        assert(Objects.equals(palmtree.getLiquid(), "Kranvatten"));
    }
}