package dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// program to find two numbers that sum to a given value
public class TwoSum {
    public int[] TwoSum(int[] nums, int target) {
        // the first approach is brute force
        // which is O(n^2)
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    // second approach is hashmap which is O(n)
    public int[] TwoSum2(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       // find the complement and check if it is present in the map
        for (int i =0; i < nums.length; i++) {
            int complement = target - nums[i];
            int currentNum = nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(currentNum, i);
        }
        return new int[] {};
    }
}
