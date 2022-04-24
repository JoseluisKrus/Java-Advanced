public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostFor1Km;
    private  int distanceTraveled = 0;

    public Car(String model, double fuelAmount, double fuelCostFor1Km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1Km = fuelCostFor1Km;
        this.distanceTraveled=getDistanceTraveled();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostFor1Km() {
        return fuelCostFor1Km;
    }

    public void setFuelCostFor1Km(double fuelCostFor1Km) {
        this.fuelCostFor1Km = fuelCostFor1Km;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
    public boolean canMove(double km){
        if (getFuelAmount()<fuelCostFor1Km*km){
            System.out.println("Insufficient fuel for the drive");
            return false;
        }
        setFuelAmount(getFuelAmount()-fuelCostFor1Km*km);
        setDistanceTraveled((int) (distanceTraveled+km));
        return true;
    }
}
