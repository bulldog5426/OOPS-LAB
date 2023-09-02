class NumberPattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        int currentNumber = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}