import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int [] [] matrix = new int[size][size];
        fillMatrix(scanner,matrix,size);
        int sumPrimary = getSumOfPrimaryDiagonal(matrix, size);
        int sumSecondary = getSumOfSecondaryDiagonal(matrix, size);
        System.out.println(Math.abs(sumPrimary-sumSecondary));
    }


    private static int getSumOfPrimaryDiagonal(int[][] matrix, int size) {
        int sum =0;
        for (int row = 0; row <size ; row++) {
            for (int col = 0; col <size ; col++) {
                if (row == col){
                    sum+=matrix[row][col];
                }
            }
        }
        return sum;
    }
    private static int getSumOfSecondaryDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col <size ; col++) {
                if (col == size - row - 1) {
                    sum +=matrix[row][col];
                }
            }
        }
        return sum;
    }
    private static void fillMatrix(Scanner scanner,int[][] matrix, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col <size ; col++) {
                matrix[row][col]= scanner.nextInt();
            }
        }
    }
}
