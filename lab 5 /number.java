public class Number {
    private double value;

    // Constructor to initialize the value
    public Number(double value) {
        this.value = value;
    }

    // Check if the number is zero
    public boolean isZero() {
        return value == 0;
    }

    // Check if the number is positive
    public boolean isPositive() {
        return value > 0;
    }

    // Check if the number is negative
    public boolean isNegative() {
        return value < 0;
    }

    // Check if the number is odd
    public boolean isOdd() {
        return value % 2 != 0;
    }

    // Check if the number is even
    public boolean isEven() {
        return value % 2 == 0;
    }

    // Check if the number is prime
    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Check if the number is an Armstrong number
    public boolean isArmstrong() {
        int num = (int) value;
        int originalNum = num;
        int n = 0;
        double sum = 0;

        // Count the number of digits in the number
        while (originalNum != 0) {
            originalNum /= 10;
            n++;
        }

        originalNum = num;

        // Calculate the sum of nth power of each digit
        while (originalNum != 0) {
            int digit = originalNum % 10;
            sum += Math.pow(digit, n);
            originalNum /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Number num1 = new Number(0);
        Number num2 = new Number(-5);
        Number num3 = new Number(7);
        Number num4 = new Number(153);

        System.out.println("Is num1 zero? " + num1.isZero());
        System.out.println("Is num2 positive? " + num2.isPositive());
        System.out.println("Is num2 negative? " + num2.isNegative());
        System.out.println("Is num3 odd? " + num3.isOdd());
        System.out.println("Is num4 even? " + num4.isEven());
        System.out.println("Is num3 prime? " + num3.isPrime());
        System.out.println("Is num4 Armstrong? " + num4.isArmstrong());
    }
}
