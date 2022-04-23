import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] names = input.split("\\s+");
        Consumer<String[]> printString = array -> {
            for (int i = 0; i < array.length ; i++) {
                System.out.println(array[i]);
            }

        };
        printString.accept(names);
    }
}
