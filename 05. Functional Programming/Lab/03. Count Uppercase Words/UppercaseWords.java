import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Predicate<String> checkerUpperCase = word -> Character.isUpperCase(word.charAt(0));

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if(checkerUpperCase.test(words.get(i))){
                result.add(words.get(i));
            }
        }
        result.forEach(e -> System.out.println(e));
    }
}
