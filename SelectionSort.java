/*
 * Selection Sort Implementation
 */

public class SelectionSort() {
    public void sort(int[] arr) {
        int n = arr.length;
        int min, temp;
        for(int i = 0; i < n - 1; i++) {
            min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
