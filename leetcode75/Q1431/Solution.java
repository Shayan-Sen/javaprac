package leetcode75.Q1431;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> result = new ArrayList<>();
        for(int i: candies){
            if(i > maxCandies){
                maxCandies = i;
            }
        }
        for(int i: candies){
            result.add((i+ extraCandies >= maxCandies));
        }

        return result;
    }
}