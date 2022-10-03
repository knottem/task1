package program;

import plants.Cactus;
import plants.Carnivorousplant;
import plants.Palmtree;
import plants.Plants;

import java.util.ArrayList;
import java.util.List;


public class Program extends Window{

    protected List<Plants> plantorna = new ArrayList<>();

    public Program() {

        plantorna.add(new Cactus("Igge", 20));
        plantorna.add(new Carnivorousplant("Meatloaf", 70));
        plantorna.add(new Palmtree("Laura", 500));
        plantorna.add(new Palmtree("Putte", 100));

        do {

            askWindow(plantorna);
            rerun = showWindow(plantorna);

        }while(rerun == 1);
    }

}
