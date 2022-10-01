package Plants;


public class Cactus extends Plants implements PlantsInterface {

    final double liquid = 0.02;

    public Cactus(String name, double heightCm) {
        super(name, heightCm);
        types = "Kaktus";
        liquidType = "Mineralvatten";
    }

    @Override
    public double calculateLiquid() {
        return liquid;
    }

}
