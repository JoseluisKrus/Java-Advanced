import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, String> emails = new LinkedHashMap<>();
        while (!command.equals("stop")){
            String name = command;
            String email = scanner.nextLine();
            if (!email.contains(".us") && !email.contains(".com") && !email.contains(".uk")){
                emails.put(name,email);
            }

            command= scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : emails.entrySet()){
            System.out.println(entry.getKey()+ " -> " + entry.getValue());
        }

    }
}
