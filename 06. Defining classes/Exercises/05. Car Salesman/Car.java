public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model,Engine engine ) {
        this.engine = engine;
        this.model = model;
        this.weight=0;
        this.color="n/a";
    }

    public Car(String model, Engine engine, int weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String printed(){
        if(this.weight==0){
            return String.format("n/a");
        }
        return String.format("%d",this.weight);
    }
    @Override
    public String toString() {
        return String.format("%s:%n" +
                "%s:%n" +
                "Power: %s%n" +
                "Displacement: %s%n" +
                "Efficiency: %s%n" +
                "Weight: %s%n" +
                "Color: %s", getModel(),engine.getModel(),engine.getPower(), engine.printed(), engine.getEfficiency(), printed(), getColor());
    }
}



