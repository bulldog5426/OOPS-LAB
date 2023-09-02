import java.util.Scanner;

class PrincipalDiagonalSum {
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

        // Display principal diagonal elements and find their sum
        int sum = 0;
        System.out.println("Principal Diagonal Elements:");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][i] + " ");
            sum += matrix[i][i];
        }

        System.out.println("\nSum of principal diagonal elements: " + sum);

        scanner.close();
    }
}
