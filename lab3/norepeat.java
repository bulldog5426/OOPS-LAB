class FourDigitCombinationsWithoutDuplication {
    public static void main(String[] args) {
        int[] digits = { 1, 2, 3, 4 };
        generateCombinationsWithoutDuplication(digits, new int[4], new boolean[4], 0);
    }

    static void generateCombinationsWithoutDuplication(int[] digits, int[] combination, boolean[] used,
            int currentIndex) {
        if (currentIndex == 4) {
            for (int digit : combination) {
                System.out.print(digit);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (!used[i]) {
                combination[currentIndex] = digits[i];
                used[i] = true;
                generateCombinationsWithoutDuplication(digits, combination, used, currentIndex + 1);
                used[i] = false;
            }
        }
    }
}