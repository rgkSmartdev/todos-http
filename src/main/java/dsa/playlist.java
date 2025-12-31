package dsa;

import java.util.HashSet;

public class playlist {
    public playlist() {
    }

    /**
     * The Longest Consecutive Sequence problem ex: { 100, 4, 200, 1, 3, 2}
     */
    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num: nums) {
            set.add(num);
        }
        for(int num : set) {
           if( !set.contains(num-1)) {
               int currentSequence = 1;
               int currentNum = num;
               while(set.contains(currentNum+1)) {
                   currentNum++;
                   currentSequence++;

               }
               longestSequence = Math.max(longestSequence, currentSequence);

           }
        }
        return longestSequence;

    }

}
