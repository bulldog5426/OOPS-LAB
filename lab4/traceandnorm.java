import java.util.Scanner;

class MatrixTraceNorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the square matrix: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];

        // Input matrix elements
        System.out.println("Enter the elements of the square matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double trace = calculateTrace(matrix);
        double norm = calculateNorm(matrix);

        System.out.println("Trace of the matrix: " + trace);
        System.out.println("Norm of the matrix: " + norm);

        scanner.close();
    }

    static double calculateTrace(double[][] matrix) {
        int n = matrix.length;
        double trace = 0;

        for (int i = 0; i < n; i++) {
            trace += matrix[i][i]; // Sum of diagonal elements
        }

        return trace;
    }

    static double calculateNorm(double[][] matrix) {
        int n = matrix.length;
        double sumOfSquares = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumOfSquares += Math.pow(matrix[i][j], 2);
            }
        }

        double norm = Math.sqrt(sumOfSquares);

        return norm;
    }
}
