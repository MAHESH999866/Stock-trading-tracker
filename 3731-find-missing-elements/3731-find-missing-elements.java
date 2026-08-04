import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> missing = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int current = nums[i];
            int next = nums[i+1];

            for(int missingNum = current + 1;missingNum < next; missingNum++){
                missing.add(missingNum);
            }
        } 
        return missing;
    }
}