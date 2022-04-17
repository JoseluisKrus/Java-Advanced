import java.util.Arrays;
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[dimension][dimension];
        int col = 0;
        for (int i = 0; i <dimension ; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }

        for (int first = 0; first < matrix.length ; first++) {
            System.out.print(matrix[first][col]+ " ");
            col +=1;
        }
        System.out.println();
        col=0;
        for (int second = matrix.length-1 ; second >=0; second--) {
            System.out.print(matrix[second][col]+ " ");
            col +=1;
        }
    }
}
