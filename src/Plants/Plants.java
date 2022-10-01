package Plants;

public abstract class Plants implements PlantsInterface {

    protected double height;
    protected String name;
    protected String types;
    protected String liquidType;


    public Plants(String name, double heightCm) {
        this.name = name;
        height = heightCm;
    }


    public String getName() {
        return name;
    }

    public double getHeight(){
        return height;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public String getTypes(){ return types;}

}
