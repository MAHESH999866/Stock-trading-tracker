class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> track = new HashSet<>();
        for(int num : nums){
            if(track.contains(num)){
                return true;
            }
            track.add(num);
        }
        return false;
    }
}