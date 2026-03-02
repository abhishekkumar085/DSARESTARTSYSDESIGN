import java.util.Arrays;

public class ThirdLargestElem {
    // Method 1
    // the Time complexity of this function will be O(n*logn) and Space Complexity
    // will be O(1) Constant.
    public static int thirdLargestElement(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        return arr[n - 3];

    }
    // Method 2
    // The Time complexity of this function will be O(n) And Space Complexity will
    // be O(1).

    public static int thirdLargestMethon2(int[] arr) {
        int n = arr.length;

        // first we will find the first maximum elem
        int firstElem = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstElem)
                firstElem = arr[i];
        }
        // now we will find the second largest element

        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] < firstElem) {
                secondLargest = arr[i];
            }
        }

        // now we will find for third largest element
        int thirdElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > thirdElement && arr[i] < secondLargest) {
                thirdElement = arr[i];
            }
        }

        return thirdElement;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 18, 90, 100, 400 };
        int result = thirdLargestElement(arr);
        System.out.println("RESULT " + result);

        int response = thirdLargestMethon2(arr);
        System.out.println("Third Largest Element will be : " + response);
    }
}
