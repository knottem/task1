package Program;

import Plants.Cactus;
import Plants.Carnivorousplant;
import Plants.Palmtree;
import Plants.Plants;

import java.util.ArrayList;


public class Program extends Window{



    public Program() {

        ArrayList<Plants> plantorna = new ArrayList<>();

        plantorna.add(new Cactus("Igge", 20));
        plantorna.add(new Carnivorousplant("Meatloaf", 70));
        plantorna.add(new Palmtree("Laura", 500));
        plantorna.add(new Palmtree("Putte", 100));

        int rerun = 0;

        do {

            askWindow(plantorna);
            rerun = showWindow(plantorna);

        }while(rerun == 1);
    }
}
