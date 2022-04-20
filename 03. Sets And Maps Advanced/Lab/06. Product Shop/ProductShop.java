import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] commands = scanner.nextLine().split(", ");
        Map<String, LinkedHashMap<String, Double>> shops = new TreeMap<>();

        while (!commands[0].equals("Revision")){
            String shop= commands[0];
            String product = commands[1];
            double price = Double.parseDouble(commands[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product, price);

            commands = scanner.nextLine().split(", ");
        }

        shops.entrySet().forEach(entry -> {
            System.out.printf(entry.getKey() + "->%n");
            entry.getValue().forEach((pro,a)-> System.out.printf("Product: %s, Price: %.1f%n", pro, a));

        });
    }
}
