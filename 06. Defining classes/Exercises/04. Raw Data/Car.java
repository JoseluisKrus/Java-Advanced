import java.util.List;

public class Car {
    private List<Tire> tires;
    private  Engine engine;
    private Cargo cargo;
    private String model;

    public Car(String model, Engine engine, Cargo cargo,List<Tire> tires ) {
        this.tires = tires;
        this.engine = engine;
        this.cargo = cargo;
        this.model = model;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
