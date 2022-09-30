package Plants;

public class Carnivorousplant extends Plants implements Tools {


    private double protein = 0.2;

    public Carnivorousplant(String name, double heightcm) {
        super(name, heightcm);
        types = "Köttätandeväxt";
        liquidType = "Protein dryck";
    }

    @Override
    public double calculateLiquid() {
        double amount = 0.1 + (protein * (height / 100));
        return amount;
    }

}
