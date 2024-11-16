package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n = nums.length / 2;

        for (int num : nums) {
            Integer value = hashMap.get(num);
            if (value != null) {
                hashMap.put(num, value + 1);
            } else {
                hashMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= n) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        majorityElement(nums);
    }
}
