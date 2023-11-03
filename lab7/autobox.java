public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive int to Integer
        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt;

        System.out.println("Autoboxing: primitiveInt to wrappedInt");
        System.out.println("primitiveInt: " + primitiveInt);
        System.out.println("wrappedInt: " + wrappedInt);

        // Unboxing: Converting Integer to primitive int
        Integer integerObject = new Integer(123);
        int unboxedInt = integerObject;

        System.out.println("\nUnboxing: integerObject to unboxedInt");
        System.out.println("integerObject: " + integerObject);
        System.out.println("unboxedInt: " + unboxedInt);

        // Autoboxing and unboxing in method parameters and return values
        calculateAndPrint(10, 20);
    }

    public static void calculateAndPrint(Integer num1, Integer num2) {
        // Autoboxing in method parameters
        int sum = num1 + num2;

        // Unboxing in method return value
        System.out.println("Sum: " + sum);
    }
}
