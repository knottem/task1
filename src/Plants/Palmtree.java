package Plants;

public class Palmtree extends Plants implements PlantsInterface {

    final double liquid = 0.5;

    public Palmtree(String name, double heightcm) {
        super(name, heightcm);
        types = "Palm";
        liquidType = "Kranvatten";
    }

    @Override
    public double calculateLiquid(){
        return liquid*(height/100);
    }



}
