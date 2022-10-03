package program;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import plants.Cactus;
import plants.Carnivorousplant;
import plants.Palmtree;

import java.util.Objects;

class WindowTest extends TestCase {


    @Test
    void askWindow() {
        double height = 100;
        String name = "Apan";

        assert(Objects.equals(new Cactus(name, height).getName(), "Apan"));
        assert(new Carnivorousplant(name, height).getHeight() == 100);

        assert(Objects.equals(new Palmtree(name, height).getLiquid(), "Kranvatten"));

    }

    @Test
    void showWindow() {


    }
}