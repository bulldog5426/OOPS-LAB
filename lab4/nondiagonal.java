import java.util.Scanner;

class NonDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the matrix: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        if (rows != columns) {
            System.out.println("Input matrix should be square (equal number of rows and columns).");
            return;
        }

        int[][] matrix = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display matrix and find sum of non-diagonal elements
        int sum = 0;
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");

                // Check if the element is non-diagonal
                if (i != j && i + j != rows - 1) {
                    sum += matrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Sum of non-diagonal elements: " + sum);

        scanner.close();
    }
}
