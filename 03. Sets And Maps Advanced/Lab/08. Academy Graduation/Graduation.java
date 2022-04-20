import java.util.*;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrades = new TreeMap<>();
        while (n-- > 0) {
            String name = scanner.nextLine();
            String[] grades = scanner.nextLine().split(" ");

            studentsGrades.putIfAbsent(name, new ArrayList<>());
            for (int i = 0; i < grades.length; i++) {
                studentsGrades.get(name).add(Double.parseDouble(grades[i]));
            }
        }
        studentsGrades.entrySet()
                .stream()
                .forEach(entry -> {
                    double sum = 0;
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        sum += entry.getValue().get(i);
                    }
                    double avgSum = sum / entry.getValue().size();

                    System.out.print(entry.getKey() + " is graduated with ");
                    System.out.printf("%.2f%n", avgSum);
                });
    }
}
