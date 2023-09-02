import java.util.Scanner;

class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Merge the two arrays
        int[] mergedArray = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = array2[i];
        }

        // Sort the merged array in ascending order
        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = i + 1; j < mergedArray.length; j++) {
                if (mergedArray[i] > mergedArray[j]) {
                    int temp = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = temp;
                }
            }
        }

        // Print the sorted merged array
        System.out.println("Merged and sorted array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
