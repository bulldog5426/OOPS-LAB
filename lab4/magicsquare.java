import java.util.Scanner;

class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the elements of the square matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of the first row to use as a reference
        int referenceSum = 0;
        for (int j = 0; j < n; j++) {
            referenceSum += matrix[0][j];
        }

        boolean isMagicSquare = true;

        // Check row sums
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != referenceSum) {
                isMagicSquare = false;
                break;
            }
        }

        // Check column sums
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != referenceSum) {
                isMagicSquare = false;
                break;
            }
        }

        // Check the principal diagonal sum
        int principalDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            principalDiagonalSum += matrix[i][i];
        }
        if (principalDiagonalSum != referenceSum) {
            isMagicSquare = false;
        }

        // Check the non-principal diagonal sum
        int nonPrincipalDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            nonPrincipalDiagonalSum += matrix[i][n - 1 - i];
        }
        if (nonPrincipalDiagonalSum != referenceSum) {
            isMagicSquare = false;
        }

        if (isMagicSquare) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }

        scanner.close();
    }
}
