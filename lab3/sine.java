import java.util.Scanner;

class SinSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        double result = 0;
        int sign = 1;
        for (int i = 1; i <= n; i += 2) {
            double term = Math.pow(x, i) / factorial(i);
            result += sign * term;
            sign = -sign; // Change the sign for the next term
        }

        System.out.println("Sin(" + x + ") = " + result);
    }

    static double factorial(int n) {
        if (n == 0) {
            return 1;
        }
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}