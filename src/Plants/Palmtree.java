package Plants;

public class Palmtree extends Plants implements PlantsInterface {

    Liquid liquid = Liquid.TAP_WATER;

    public Palmtree(String name, double heightCm) {
        super(name, heightCm);
        types = "Palm";
    }

    @Override
    public double calculateLiquid(){
        return liquid.amount*(height/100);
    }

    @Override
    public String getLiquid() {
        return liquid.name;
    }
}
