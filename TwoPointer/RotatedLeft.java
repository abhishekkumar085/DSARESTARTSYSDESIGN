package TwoPointer;

public class RotatedLeft {

    public static int[] leftRotated(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n - 1; i++) {
            result[i] = nums[i + 1];

        }
        result[n - 1] = nums[0];
        return result;
    }

    public static void leftRotatedOptimal(int[] nums) {
        int n = nums.length;
        int first = nums[0];

        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[n - 1] = first;
    }

    public static void rightRotateOptimal(int[] nums) {
        int n = nums.length;
        int lastNum = nums[n - 1];
        for (int i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = lastNum;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        // int[] response = leftRotated(nums);

        // for (int num : response) {
        // System.out.print(num + ",");
        // }

        // leftRotatedOptimal(nums);
        // for (int num : nums) {
        // System.out.print(num + " ");
        // }
        System.out.println("--------------------------------");
        rightRotateOptimal(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
