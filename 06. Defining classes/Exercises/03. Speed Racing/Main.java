import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Car> carList = new LinkedHashMap<>();
        Car car;
        for (int i = 0; i <n ; i++) {
            String [] input = scanner.nextLine().split(" ");
            car= new Car(input[0],Double.parseDouble(input[1]),Double.parseDouble(input[2]));
            carList.put(input[0], car);
        }
        String [] input = scanner.nextLine().split(" ");
        while (!input[0].equals("End")){
            String name = input[1];
            double km = Double.parseDouble(input[2]);
            carList.get(name).canMove(km);


            input = scanner.nextLine().split(" ");
        }

       carList.entrySet().forEach(entry -> {
           System.out.println(String.format("%s %.2f %d", entry.getValue().getModel(),entry.getValue().getFuelAmount(), entry.getValue().getDistanceTraveled()));
       });


    }
}
