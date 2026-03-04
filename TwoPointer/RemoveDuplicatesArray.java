package TwoPointer;

public class RemoveDuplicatesArray {

    public static int removeDuplicates(int[] nums) {
        int index = 0;
        int unique = 1;
        int elem = 1;
        int n = nums.length;

        while (elem < n) {
            if (nums[elem] == nums[elem - 1]) {
                elem++;
                continue;

            }
            nums[index + 1] = nums[elem];
            index++;
            unique++;
            elem++;
        }

        return unique;

    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int res = removeDuplicates(nums);
        System.out.println("REMOVED DUPLICATES FROM ARRAY : " + res);

    }
}
