package program;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import plants.Cactus;
import plants.Carnivorousplant;
import plants.Palmtree;

class ToolsTest extends TestCase {

    Cactus a = new Cactus("George", 120);
    Carnivorousplant p = new Carnivorousplant("Data", 70);
    Palmtree b = new Palmtree("Ubbe", 500);

    @Test
    void convertLToCl() {
        assert(a.calculateLiquid()*100 == 2);
    }

    @Test
    void showMessage() {
        String liquid = (b.calculateLiquid() + " Liter");
        assert(b.calculateLiquid() == 2.5);
        assert(liquid.equals("2.5 Liter"));
    }


    @Test
    void optionsMessage() {
    }

    @Test
    void questionMessage() {
    }
}