import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0; int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();  // first index, count
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){count --;} else {count ++;}

            if (map.containsKey(count)){
                max = Math.max(max, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return max;
    }
}