package plants;

public enum Liquid {
    TAP_WATER("Kranvatten", 0.5),
    MINERAL_WATER("Mineralvatten", 0.02),
    PROTEIN_LIQUID("Protein dryck", 0.2);

    final double amount;
    final String name;

    Liquid(String name, double amount) {
        this.amount = amount;
        this.name = name;
    }

}
