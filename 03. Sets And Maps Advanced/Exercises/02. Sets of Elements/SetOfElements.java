import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input =scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>(n);
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>(m);

        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }

        for (int i = 0; i <m ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        firstSet.retainAll(secondSet);
        for (Integer number :firstSet) {
            System.out.print(number+" ");
        }
    }
}
