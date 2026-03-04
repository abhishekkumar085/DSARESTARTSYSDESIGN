package TwoPointer;

public class LargestElement {

    public static int LargestElementInArray(int[] nums) {
        int n = nums.length;

        int largest = nums[0];

        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static int secondLargest(int[] nums) {
        int n = nums.length;
        int secondLargest = nums[0];
        int largest = LargestElementInArray(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];

            }
        }
        return secondLargest;
    }

    public static int secondSmallestElement(int[] nums) {
        int n = nums.length;
        int smallestElem = nums[0];
        int secondSmallest = nums[0];

        for (int i = 0; i < n; i++) {
            if (nums[i] < smallestElem) {
                smallestElem = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] < secondSmallest && nums[i] != smallestElem) {
                secondSmallest = nums[i];
            }

        }
        return secondSmallest;
    }

    // Optimal Solution for the 2nd largest and 2nd smallest element

    public static int secondSmallest(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return -1;
        }
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] < smallest) {
                second_smallest = smallest;
                smallest = nums[i];
            } else if (nums[i] < second_smallest && nums[i] != smallest) {
                second_smallest = nums[i];
            }
        }
        return second_smallest;
    }

    public static int secondLargestElem(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] < largest) {
                second_largest = largest;
                largest = nums[i];
            } else if (nums[i] < second_largest && nums[i] != largest) {
                second_largest = nums[i];
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 1, 43, 56, 3 };
        // int result = LargestElementInArray(nums);
        // System.out.println("Largest Element will be : " + result);
        // int res = secondLargest(nums);
        // System.out.println("SecondLargest: " + res);
        // int secondSmallestElement = secondSmallestElement(nums);
        // System.out.println("SecondSmallest: " + secondSmallestElement);

        int[] arr = { 1 };

        int sS = LargestElement.secondSmallest(arr);
        int sL = LargestElement.secondLargest(arr);

        System.out.println("Second smallest is " + sS);
        System.out.println("Second largest is " + sL);
    }

}
