import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        //push
        for (int i = 1; i <= n; i++) {
            stack.push(scanner.nextInt());
        }
        //pop
        for (int i = 1; i <= s; i++) {
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}
