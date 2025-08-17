package freecode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

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

        for (int i = 0; i < numsLength;) {
            list = SymDiff(nums[i], nums[i++]);
        }
        return list;
    }

    public int[] SymDiff(int[] arg1, int[] arg2) {
        HashSet<Integer> delta = new HashSet<Integer>();
        for (int i = 0; i < arg1.length; i++) {
            for (int j = 0; j < arg2.length; j++) {
                if (arg1[i] != arg2[j]) {
                    delta.add(arg1[i]);
                }
            }
        }
        int[] result = new int[delta.size()];
        int i = 0;
        for (Integer integer : delta) {
            result[i++] = integer;
        }
        return result;
    }
}
