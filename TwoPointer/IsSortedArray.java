package TwoPointer;

public class IsSortedArray {
    // Brute force approach
    public static boolean isSortedBrute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Optimal Approach

    public static boolean isSortedOptimal(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 2, 3, 4, 5 };
        // System.out.println(isSortedBrute(nums));
        System.out.println(isSortedOptimal(nums));

    }
}
