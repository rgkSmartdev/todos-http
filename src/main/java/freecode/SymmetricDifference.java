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
        int[] list;
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
        // sym difference is eliminating elements which are present in both the arrays
        Stream<Integer> S1 = Arrays.stream(arg1).boxed();
        Stream<Integer> S2 = Arrays.stream(arg2).boxed();
        int[] mergedArr = Stream.concat(S1, S2).mapToInt(Integer::intValue).toArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < mergedArr.length; i++) {
            for (int j = i + 1; j < mergedArr.length; j++) {
                if (mergedArr[i] == mergedArr[j]) {
                    list.add(mergedArr[i]);
                }
            }
        }
        return list.isEmpty() ? mergedArr :  list.stream().mapToInt(Integer::intValue).toArray();
    }
}
