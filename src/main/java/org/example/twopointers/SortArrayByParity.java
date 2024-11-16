package org.example.twopointers;

import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int evenIndex = nums.length - 1;
        int oddIndex = 0;
        while (left <= right) {
            if (nums[left] % 2 == 0) {
                result[oddIndex] = nums[left];
                oddIndex++;
                left++;
            } else {
                result[evenIndex] = nums[left];
                evenIndex--;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        sortArrayByParity(nums);
    }
}
