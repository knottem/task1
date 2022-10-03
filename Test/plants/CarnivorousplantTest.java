package plants;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousplantTest extends TestCase {


    Carnivorousplant a = new Carnivorousplant("George", 70);
    Carnivorousplant b = new Carnivorousplant("Jacob", 0);
    Carnivorousplant c = new Carnivorousplant("Jacob", 100);
    Carnivorousplant d = new Carnivorousplant("Jacob", 700);
    Carnivorousplant e = new Carnivorousplant("asd", 90000);

    BigDecimal cd = BigDecimal.valueOf(c.calculateLiquid()).setScale(2, RoundingMode.HALF_DOWN);
    BigDecimal dd = BigDecimal.valueOf(d.calculateLiquid()).setScale(2, RoundingMode.HALF_DOWN);
    BigDecimal ed = BigDecimal.valueOf(e.calculateLiquid()).setScale(2, RoundingMode.HALF_DOWN);


    @Test
    void calculateLiquid() {
        assert(a.calculateLiquid() == 0.24);
        assert(b.calculateLiquid() == 0.1);
        assert(cd.doubleValue() == 0.3);
        assert(dd.doubleValue() == 1.50);
        assert(ed.doubleValue() == 180.1);
    }

    @Test
    void getLiquid() {
        assert(!Objects.equals(a.getLiquid(), "Mineralvatten"));
        assert(Objects.equals(a.getLiquid(), "Protein dryck"));
        assert(!Objects.equals(a.getLiquid(), "Kranvatten"));
    }
}