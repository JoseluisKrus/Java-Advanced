import java.util.*;

public class Cities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String [] commands = scanner.nextLine().split(" ");
        Map<String, Map<String,List<String>>> cities = new LinkedHashMap<>();

        while (n-->0){
            String continent= commands[0];
            String country = commands[1];
            String city = commands[2];

            cities.putIfAbsent(continent, new LinkedHashMap<>());
            cities.get(continent).putIfAbsent(country, new LinkedList<>());
            cities.get(continent).get(country).add(city);

            commands = scanner.nextLine().split(" ");
        }

        cities.entrySet().forEach(entry -> {
            System.out.printf(entry.getKey() + ":%n");
            entry.getValue().forEach((pro,a)-> System.out.printf("%s -> %s%n", pro, a));

        });
    }
}
