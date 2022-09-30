package Plants;

public class Carnivorousplant extends Plants implements PlantsInterface {


    final double protein = 0.2;

    public Carnivorousplant(String name, double heightcm) {
        super(name, heightcm);
        types = "Köttätandeväxt";
        liquidType = "Protein dryck";
    }

    @Override
    public double calculateLiquid() {
        return 0.1 + (protein * (height / 100));
    }

}
