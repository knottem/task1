package program;

import plants.Cactus;
import plants.Carnivorousplant;
import plants.Palmtree;
import plants.Plants;

import java.util.ArrayList;
import java.util.List;


public class Program extends Window{

    //Skapar List för alla mina plants
    protected List<Plants> plantorna = new ArrayList<>();

    public Program() {

        //Lägger in varje plant som redan finns i arraylist.
        plantorna.add(new Cactus("Igge", 20));
        plantorna.add(new Carnivorousplant("Meatloaf", 70));
        plantorna.add(new Palmtree("Laura", 500));
        plantorna.add(new Palmtree("Putte", 100));

        do {

            //Frågar om man vill lägga till, ta bort eller visa själva listan av plants
            askWindow(plantorna);

            //Frågar om man vill köra om programmet, isåfall returnar man en int av värdet 1
            rerun = rerunWindow(plantorna);

        }while(rerun == 1);
    }

}
