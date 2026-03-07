package TwoPointer;

import java.util.Arrays;

public class RotateArrayByK {

    public static void rotateRight(int[] arr, int k) {

        int n = arr.length;

        if (n == 0)
            return;

        k = k % n;

        // Store last k elements
        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        // Shift remaining elements
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Copy temp elements to front
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;

        rotateRight(arr, k);
        int n = arr.length;
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        for (int num : temp) {
            System.out.println(num);
        }

        System.out.println("Array after right rotation: " + Arrays.toString(arr));
    }
}