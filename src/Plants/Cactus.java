package Plants;


public class Cactus extends Plants implements PlantsInterface {

    Liquid liquid = Liquid.MINERAL_WATER;

    public Cactus(String name, double heightCm) {
        super(name, heightCm);
        types = "Kaktus";
    }

    @Override
    public double calculateLiquid() {
        return liquid.amount;
    }

    @Override
    public String getLiquid() {
        return liquid.name;
    }
}
