class FourDigitCombinationsWithDuplication {
    public static void main(String[] args) {
        int[] digits = { 1, 2, 3, 4 };
        generateCombinationsWithDuplication(digits, new int[4], 0);
    }

    static void generateCombinationsWithDuplication(int[] digits, int[] combination, int currentIndex) {
        if (currentIndex == 4) {
            for (int digit : combination) {
                System.out.print(digit);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            combination[currentIndex] = digits[i];
            generateCombinationsWithDuplication(digits, combination, currentIndex + 1);
        }
    }
}