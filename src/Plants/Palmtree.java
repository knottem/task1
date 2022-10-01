package Plants;

public class Palmtree extends Plants implements PlantsInterface {

    final double liquid = 0.5;

    public Palmtree(String name, double heightCm) {
        super(name, heightCm);
        types = "Palm";
        liquidType = "Kranvatten";
    }

    @Override
    public double calculateLiquid(){
        return liquid*(height/100);
    }



}
