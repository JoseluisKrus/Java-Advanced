import java.util.*;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> cars = new LinkedHashSet<>();

        while (!input.equals("END")){
            String [] commands = input.split(", ");
            if(commands[0].equals("IN")){
                cars.add(commands[1]);
            }else if(commands[0].equals("OUT")){
                cars.remove(commands[1]);
            }
            input = scanner.nextLine();
        }
        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        for (String c:cars) {
            System.out.println(c);
        }



    }
}
