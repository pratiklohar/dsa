package algo.sort;

import java.util.Arrays;

class BubbleSort {
    public static int[] sort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int temp;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(BubbleSort.sort(new int[]{12, 4, 2, 32, 0, 5})));
    }
}
