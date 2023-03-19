import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int matrixSize = scanner.nextInt();

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean isSymetric = true;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymetric = false;
                    break;
                }
            }
        }
        if (isSymetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}