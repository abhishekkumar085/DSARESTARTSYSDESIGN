package TwoPointer;

import java.util.HashSet;

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

    public static int removeDuplicatesBrute(int[] nums) {
        // HashSet to store unique elements we have seen
        HashSet<Integer> seen = new HashSet<>();

        // Position to overwrite next unique element
        int index = 0;

        for (int num : nums) {

            // If num is not in the set, it is unique
            if (!seen.contains(num)) {
                seen.add(num);

                // Write num at current index position
                nums[index] = num;

                // Move index forward
                index++;
            }

        }
        return index;

    }

    public static int removeDuplicatedOptimal(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // Pointer for last unique element
        int i = 0;
        // Start from second element
        for (int j = 1; j < nums.length; j++) {
            // If new unique element is found
            if (nums[j] != nums[i]) {
                // Move unique position forward
                i++;
                // Place new unique element
                nums[i] = nums[j];
            }
        }
        // i is last index of unique element, count = i + 1
        return i + 1;
    }

    public static void main(String[] args) {
        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int res = removeDuplicates(nums);
        // int res1 = removeDuplicatesBrute(nums);
        // int res2 = removeDuplicatedOptimal(nums);
        // System.out.println("REMOVED DUPLICATES FROM ARRAY : " + res);
        // System.out.println("REMOVED DUPLICATES FROM ARRAY : " + res1);
        // System.out.println("REMOVED DUPLICATES FROM ARRAY : " + res2);

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int res2 = removeDuplicatedOptimal(nums);

        System.out.println("Unique Count : " + res2);

        for (int i = 0; i < res2; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
