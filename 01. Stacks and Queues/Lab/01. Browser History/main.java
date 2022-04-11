import java.util.ArrayDeque;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String currentURL = "";
        ArrayDeque <String> history = new ArrayDeque<>();
        while (!command.equals("Home")){
            if (command.equals("back")){
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                }
                String prevURL= history.pop();
                currentURL= prevURL;

            }else {
                if (!currentURL.equals("")) {
                    history.push(currentURL);
                }
                currentURL = command;
            }
            System.out.println(currentURL);
            command = scanner.nextLine();

        }
    }
}
