import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrices
        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = scanner.nextInt();

        // Check if the matrices can be added and multiplied
        if (colsA != colsB || rowsA != rowsB) {
            System.out.println("Matrices cannot be added or multiplied due to incompatible dimensions.");
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] sumMatrix = new int[rowsA][colsA];
        int[][] productMatrix = new int[rowsA][colsA];

        // Input elements for matrix A
        System.out.println("Enter elements for matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input elements for matrix B
        System.out.println("Enter elements for matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Add matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Multiply matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                for (int k = 0; k < colsA; k++) {
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display the sum matrix
        System.out.println("Sum of matrices:");
        displayMatrix(sumMatrix);

        // Display the product matrix
        System.out.println("Product of matrices:");
        displayMatrix(productMatrix);

        scanner.close();
    }

    static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
