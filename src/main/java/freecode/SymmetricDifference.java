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
            list = symmetricDifference(nums[0], nums[1]);
            return list;
        } else {
            list = symmetricDifference(nums[0], nums[1]);
            for (int i = 2; i < numsLength; i++) {
                list = symmetricDifference(list, nums[i]);
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

    /***
     * Sym Diff is finding elements that are in either sets but not on both
     * @param arg1
     * @param arg2
     * @return Symmetric difference
     */
    public int[] symmetricDifference(int[] arg1, int[] arg2) {
        // eliminate duplicates from both arrays
         Set<Integer> s1 = new HashSet<Integer>();
         Set<Integer> s2 = new HashSet<Integer>();

         for (int i : arg1) {
             s1.add(i);
         }
         for (int i : arg2) {
             s2.add(i);
         }
         List<Integer> result = new ArrayList<Integer>();

         for (int i : s1) {
             if (!s2.contains(i)) {
                 result.add(i);
             }
         }
         for (int i : s2) {
             if (!s1.contains(i)) {
                 result.add(i);
             }
         }

         return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] selectionSort(int[] nums) {
        int[] sorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            // swap
            int temp = nums[i];
            nums[i] = min;
            nums[minIndex] = temp;
            sorted[i] = min;
        }
        return sorted;
    }
}
