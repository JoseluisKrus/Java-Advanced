import java.util.Arrays;
import java.util.Scanner;

public class Positions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int matrixRows = dimensions[0];
        int matrixCols = dimensions[1];
        int [][] matrix = new int[matrixRows][matrixCols];
        for (int i = 0; i <matrixRows ; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }

        int searchedNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;

        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                if (matrix[row][col] == searchedNumber){
                    System.out.println(row + " " + col);
                    isFound= true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }



    }
}