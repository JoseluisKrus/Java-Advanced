import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftuniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Set<String> guests = new TreeSet<>();
        while (!command.equals("END")){
            guests.add(command);
            if(command.equals("PARTY")){
                while (!command.equals("END")){
                    guests.remove(command);

                    command = scanner.nextLine();
                }
                break;

            }
            command = scanner.nextLine();
        }
        System.out.println(guests.size());
        for (String g:guests) {
            System.out.println(g);
        }
    }
}
