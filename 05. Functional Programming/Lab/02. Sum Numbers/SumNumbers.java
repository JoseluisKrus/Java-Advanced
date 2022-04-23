import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();


        long count = Arrays.stream(numbers).count();
        int sum= Arrays.stream(numbers).sum();
        System.out.printf("Count = %d%n", count);
        System.out.printf("Sum = %d", sum);
    }
}
