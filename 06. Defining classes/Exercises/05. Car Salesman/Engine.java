public class Engine {
    private String model;
    private String power;
    private int displacements;
    private String efficiency;

    public Engine(String model, String power) {
        this.model = model;
        this.power = power;
        this.displacements = 0;
        this.efficiency = "n/a";
    }

    public Engine(String model, String power, int displacements) {
        this.model = model;
        this.power = power;
        this.displacements = displacements;
        this.efficiency="n/a";
    }

    public Engine(String model, String power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    public Engine(String model, String power, int displacements, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacements = displacements;
        this.efficiency = efficiency;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getDisplacements() {
        return displacements;
    }

    public String setDisplacements(int displacements) {
        String a = "";
        if (displacements == 0) {
            a = "n/a";

        }
        return a;
    }
    public String printed(){
        if(this.displacements==0){
            return String.format("n/a");
        }
        return String.format("%d",this.displacements);
    }
    public String getEfficiency() {
        return this.efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

}

