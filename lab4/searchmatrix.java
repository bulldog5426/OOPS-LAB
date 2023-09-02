import java.util.Scanner;

class MatrixElementSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int count = countOccurrences(matrix, target);

        if (count > 0) {
            System.out.println("The element " + target + " appears " + count + " times in the matrix.");
        } else {
            System.out.println("The element " + target + " does not appear in the matrix.");
        }

        scanner.close();
    }

    static int countOccurrences(int[][] matrix, int target) {
        int count = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == target) {
                    count++;
                }
            }
        }

        return count;
    }
}
