import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int matrixRows = dimensions[0];
        int matrixCols = dimensions[1];
        int [][] matrix = new int [matrixRows][matrixCols];
        int [][] maximumMatrix = new  int [2][2];
        for (int i = 0; i <matrixRows ; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        System.out.println(sumOfMatrix(matrix,maximumMatrix));
    }
    private static int sumOfMatrix(int[][] matrix, int [][] maximumMatrix) {
        int sum =0;
        int max = 0;
        for (int row = 0; row <matrix.length-1 ; row++) {
            for (int col = 0; col <matrix[row].length-1 ; col++) {
                sum =matrix[row][col] + matrix[row][col+1] + matrix[row+1][col] + matrix[row+1][col+1];
                if (sum >max){
                    max = sum;
                    maximumMatrix[0][0]=matrix[row][col];
                    maximumMatrix[0][1]=matrix[row][col+1];
                    maximumMatrix[1][0]=matrix[row+1][col];
                    maximumMatrix[1][1]=matrix[row+1][col+1];
                }
            }
        }
        for (int row = 0; row < maximumMatrix.length ; row++) {
            for (int cols = 0; cols <maximumMatrix[row].length ; cols++) {
                System.out.print(maximumMatrix[row][cols] + " ");
            }
            System.out.println();
        }
        return max;

    }
}
