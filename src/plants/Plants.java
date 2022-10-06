package plants;

public abstract class Plants implements PlantsInterface {

    //inkapsling här men protected istället för private så mina plantklasser kan använda dem.

    protected double height;
    protected String name;
    protected String types;

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

    public String getTypes(){
        return types;
    }

}
