package freecode;

import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;

/**
 * Symmetric difference - find the elements that are in one set but not the other.
 * @author gowtham
 */
public class SymmetricDifference {

    public SymmetricDifference() {
    }

    public int[] findSymmetricDifference(int[]... nums) {
        int numsLength = nums.length;
        int[] list = new int[10];
        System.out.println("Length: " + numsLength);
        if (numsLength == 1) {
            return nums[0];
        } else if (numsLength == 2) {
            list = SymDiff(nums[0], nums[1]);
            return list;
        } else {
            list = SymDiff(nums[0], nums[1]);
            for (int i = 2; i < numsLength; i++) {
                list = SymDiff(list, nums[i]);
            }
        }

        return list;
    }

    public int[] SymDiff(int[] arg1, int[] arg2) {
        Stream<Integer> s1 = Arrays.stream(arg1).boxed();
        Stream<Integer> s2 = Arrays.stream(arg2).boxed();

        return Stream.concat(s1, s2).distinct().mapToInt(Integer::intValue).toArray();
    }
}
