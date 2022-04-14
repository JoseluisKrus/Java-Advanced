import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstMatrixDimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int firstMatrixRows = firstMatrixDimensions[0];
        int firstMatrixCols = firstMatrixDimensions[1];
        int [][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];

        for (int i = 0; i <firstMatrixRows ; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            firstMatrix[i] = arr;
        }


        int[] secondMatrixDimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int secondMatrixRows = secondMatrixDimensions[0];
        int secondMatrixCols = secondMatrixDimensions[1];
        int [][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];

        for (int i = 0; i <secondMatrixRows ; i++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            secondMatrix[i] = arr;
        }

        if(matricesAreEqual(firstMatrix,secondMatrix)) {
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }



    }

    private static boolean matricesAreEqual(int [][] firstMatrix, int [][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {
                return false;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]){
                    return false;
                }
            }
        }
        return true;
    }
}
