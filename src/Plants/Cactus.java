package Plants;

public class Cactus extends Plants implements Tools {

    private double liquid = 0.02;

    public Cactus(String name, double heightcm) {
        super(name, heightcm);
        types = "Kaktus";
        liquidType = "Mineral Vatten";
    }

    @Override
    public double calculateLiquid() {
        return liquid;
    }
}
