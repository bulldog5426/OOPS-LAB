import java.util.Scanner;

class PowerSeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(1.0 / i, i);
        }

        System.out.println("Sum = " + sum);
    }
}