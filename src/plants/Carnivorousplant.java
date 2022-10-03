package plants;

public class Carnivorousplant extends Plants implements PlantsInterface {

    Liquid liquid = Liquid.PROTEIN_LIQUID;

    public Carnivorousplant(String name, double heightCm) {
        super(name, heightCm);
        types = "Köttätande växt";
    }

    @Override
    public double calculateLiquid() {
        return (((height/100) * liquid.amount) + 0.1);
    }

    public String getLiquid() {
        return liquid.name;
    }
}
