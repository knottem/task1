package plants;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;


class PalmtreeTest extends TestCase {

    Palmtree a = new Palmtree("Ubbe", 500);
    Palmtree b = new Palmtree("Ubbe", 50000);
    Palmtree c = new Palmtree("Ubbe", 2505);

    BigDecimal cd = BigDecimal.valueOf(c.calculateLiquid()).setScale(2, RoundingMode.HALF_UP);

    @Test
    void calculateLiquid() {
        assert(a.calculateLiquid() == 2.5);
        assert(b.calculateLiquid() == 250);
        assert(cd.doubleValue() == 12.53);

    }

    @Test
    void getLiquid() {
        assert(!Objects.equals(a.getLiquid(), "Mineralvatten"));
        assert(!Objects.equals(a.getLiquid(), "Protein dryck"));
        assert(Objects.equals(a.getLiquid(), "Kranvatten"));
    }
}