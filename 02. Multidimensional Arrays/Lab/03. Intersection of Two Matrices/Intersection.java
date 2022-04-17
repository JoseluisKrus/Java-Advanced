import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char [][] firstMatrix = new char[rows][cols];
        char [][] secondMatrix = new char [rows][cols];
        char[][] thirdMatrix = new char[rows][cols];
        for (int i = 0; i <rows ; i++) {
            char[] arr = scanner.nextLine().replace(" ", "").toCharArray();
            firstMatrix[i]=arr;
        }
        for (int i = 0; i <rows ; i++) {
            char[] arr = scanner.nextLine().replace(" ", "").toCharArray();
            secondMatrix[i]=arr;
        }
        matchingSymbols(firstMatrix,secondMatrix, thirdMatrix);
        printingMatrix(thirdMatrix);

    }

    private static void printingMatrix(char[][] thirdMatrix) {
        for (int row = 0; row < thirdMatrix.length ; row++) {
            for (int cols = 0; cols <thirdMatrix[row].length ; cols++) {
                System.out.print(thirdMatrix[row][cols] + " ");
            }
            System.out.println();
        }
    }

    private static void matchingSymbols(char[][] firstMatrix, char[][] secondMatrix, char[][] thirdMatrix) {
        for (int row = 0; row < firstMatrix.length ; row++) {
            for (int col = 0; col <firstMatrix[row].length ; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    thirdMatrix[row][col] = firstMatrix[row][col];
                }else {
                    thirdMatrix[row][col] = '*';
                }

            }

        }
    }
}
