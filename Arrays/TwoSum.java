package Arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> seen = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            int s = target - current;
            if(seen.containsKey(s)){
                return new int[]{seen.get(s),i};
            }else{
                seen.put(current,i);
            }
        }
        return new int[]{};
    }
}
