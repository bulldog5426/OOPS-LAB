class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    public ComplexNumber add(int integer, ComplexNumber complex) {
        double realSum = integer + complex.real;
        double imagSum = complex.imag;
        return new ComplexNumber(realSum, imagSum);
    }

    public ComplexNumber add(ComplexNumber complex1, ComplexNumber complex2) {
        double realSum = complex1.real + complex2.real;
        double imagSum = complex1.imag + complex2.imag;
        return new ComplexNumber(realSum, imagSum);
    }
}

public class ComplexMath {
    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(2, 3);
        ComplexNumber complex2 = new ComplexNumber(1, 5);
        int integer = 7;

        ComplexNumber result1 = complex1.add(integer, complex1);
        System.out.println("Result 1: " + result1);

        ComplexNumber result2 = complex1.add(complex1, complex2);
        System.out.println("Result 2: " + result2);
    }
}
