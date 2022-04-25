import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEngines = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new LinkedHashMap<>();
        for (int i = 0; i < numEngines; i++) {
            Engine engine;
            String [] input = scanner.nextLine().split(" ");
            if(input.length ==2){
                 engine = new Engine(input[0], input[1]);
                 engines.put(input[0],engine);
            }else if (input.length==3) {
                if(Character.isDigit(input[2].charAt(0))){
                    engine = new Engine(input[0], input[1], Integer.parseInt(input[2]));
                }else {
                     engine=new Engine(input[0], input[1],input[2]);
                }

                engines.put(input[0],engine);
            }else {
                 engine = new Engine(input[0], input[1], Integer.parseInt(input[2]), input[3]);
                engines.put(input[0],engine);
            }
        }
        List<Car> carList = new LinkedList<>();

        int numCars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCars; i++) {
            Car car;
            String [] input = scanner.nextLine().split(" ");
            String engine = input[1];
            Engine engine1 = engines.get(engine);
            if(input.length ==2){
                car  = new Car(input[0], engine1);
                carList.add(car);
            }else if (input.length==3) {
                if(Character.isDigit(input[2].charAt(0))){
                    car= new Car(input[0], engine1, Integer.parseInt(input[2]));
                }else {
                   car = new Car(input[0],engine1, input[2]);
                }
                carList.add(car);
            }else {
                car  = new Car(input[0], engine1, Integer.parseInt( input[2]), input[3]);
                carList.add(car);
            }
        }
        for (Car car :carList) {
            System.out.println(car.toString());
        }
    }
}
