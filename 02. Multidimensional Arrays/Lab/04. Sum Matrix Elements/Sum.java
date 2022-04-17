import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int matrixRows = dimensions[0];
        int matrixCols = dimensions[1];
        int [][] matrix = new int [matrixRows][matrixCols];
        for (int i = 0; i <matrixRows ; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        System.out.println(matrixRows);
        System.out.println(matrixCols);
        System.out.println(sumOfMatrix(matrix));

    }

    private static int sumOfMatrix(int[][] matrix) {
        int sum =0;
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                sum +=matrix[row][col];
            }
        }
        return sum;
    }
}
