package ecomm;

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

    public static void main(String[] args) {
        int[] nums = { 2, 1, 4, 56, 3 };
        int result = LargestElementInArray(nums);
        System.out.println("Largest Element will be : " + result);
    }

}
