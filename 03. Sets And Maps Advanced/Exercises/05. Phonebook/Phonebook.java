import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();
        while (!command.equals("stop")){
            if (command.equals("search")){
                String name = scanner.nextLine();
                while (!name.equals("stop")) {
                    if (phonebook.containsKey(name)) {
                        System.out.println(name+" -> "+phonebook.get(name));
                    } else {
                        System.out.printf("Contact %s does not exist.\n", name);
                    }
                    name = scanner.nextLine();
                }
                command=name;
            }else {
                String [] text = command.split("-");
                String name = text[0];
                String phone = text[1];
                phonebook.put(name,phone);
                command= scanner.nextLine();
            }


        }
    }
}
