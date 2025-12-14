public class bubbleSortInt {   
    public static void main(String[] args) {

        int[] num = {4, 5, 1, 3, 2};

        // Print array before sorting
        System.out.println("Before Sorting:");
        for (int value : num) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Bubble Sort
        int n = num.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    // Swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        // Print array after sorting
        System.out.println("\nAfter Sorting:");
        for (int value : num) {
            System.out.print(value + " ");
        }
    }
}
