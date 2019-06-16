/*
 * Bubble Sort Implementation
 */

public class BubbleSort() {
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            int swaps = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
                System.out.println(Arrays.toString(arr));
            }
            if (swaps == 0) return;
        }
    }
}
