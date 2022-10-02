package Plants;

public enum Liquid {
    TAP_WATER("Kran vatten", 0.5),
    MINERAL_WATER("Mineral vatten", 0.02),
    PROTEIN_LIQUID("Protein dryck", 0.2);

    final double amount;
    final String name;

    Liquid(String name, double amount) {
        this.amount = amount;
        this.name = name;
    }

}
