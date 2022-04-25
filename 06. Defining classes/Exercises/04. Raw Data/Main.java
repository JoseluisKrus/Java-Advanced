import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new LinkedList<>();


        for (int i = 0; i <n ; i++) {
            String [] input = scanner.nextLine().split(" ");
            Cargo cargo = new Cargo();
            Engine engine = new Engine();
            List<Tire> tires = new LinkedList<>();
            String model = input[0];
            engine.setSpeed(Integer.parseInt(input[1]));
            engine.setPower(Integer.parseInt(input[2]));
            cargo.setWeight(Integer.parseInt(input[3]));
            cargo.setType(input[4]);

            for (int j = 5; j <input.length ; j+=2) {
               Tire tire = new Tire();
               tire.setPressure(Double.parseDouble(input[j]));
               tire.setAge(Integer.parseInt(input[j+1]));
               tires.add(tire);
            }
            Car car = new Car(model,engine,cargo,tires);
            carList.add(car);
        }
        String typeToShow = scanner.nextLine();


        switch (typeToShow)
        {
            case "fragile":
                DisplayFragile(carList);
                break;
            case "flamable":
                DisplayFlamable(carList);
                break;
        }
    }
    static void DisplayFragile(List<Car> cars) {
        for(Car car : cars){
            String model = "";
            for (Tire tire: car.getTires())
            {

                if (tire.getPressure()< 1 && car.getModel()!= model)
                {
                    model = car.getModel();
                    System.out.printf("%s\n", car.getModel());
                }
            }

        }
    }

    static void DisplayFlamable(List<Car> cars)
    {
        for(Car car : cars)
        {
            if(car.getEngine().getPower() > 250)
                System.out.printf("%s\n", car.getModel());

        }
    }
}
