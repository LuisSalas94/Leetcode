package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
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
            if (value == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber(nums);
        System.out.println(result);
    }
}
