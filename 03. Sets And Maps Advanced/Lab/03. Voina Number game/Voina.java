import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;
        while (rounds-- >0){
            int firstNumber = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstNumber);

            int secondNumber = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondNumber);

            if(firstNumber>secondNumber){
                firstPlayerCards.add(firstNumber);
                firstPlayerCards.add(secondNumber);
            }else if(firstNumber<secondNumber){
                secondPlayerCards.add(firstNumber);
                secondPlayerCards.add(secondNumber);
            }

            if(firstPlayerCards.isEmpty() || secondPlayerCards.isEmpty() ){
                break;
            }
        }
        if(secondPlayerCards.size() == firstPlayerCards.size()){
            System.out.println("Draw!");
        }
        if(secondPlayerCards.size()> firstPlayerCards.size()){
            System.out.println("Second player win!");
        }else {
            System.out.println("First player win!");
        }

    }
}
