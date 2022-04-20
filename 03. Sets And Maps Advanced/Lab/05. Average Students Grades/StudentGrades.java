import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrades = new TreeMap<>();
        while (number-->0){
            String[] tokens = scanner.nextLine().split("\\s+");
            String student = tokens[0];
            double grade = Double.parseDouble(tokens[1]);

            studentsGrades.putIfAbsent(student, new ArrayList<>());
            studentsGrades.get(student).add(grade);

        }
        studentsGrades.entrySet()
                .stream()
                .forEach(entry -> {
                    double sum = 0;
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        sum += entry.getValue().get(i);
                    }
                    double avgSum = sum / entry.getValue().size();

                    System.out.print(entry.getKey() + " -> ");
                    entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
                    System.out.printf("(avg: %.2f)%n", avgSum);
                });
    }
}
