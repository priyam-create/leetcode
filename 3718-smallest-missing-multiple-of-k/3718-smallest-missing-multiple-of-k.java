class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int missing=k;
        for(int num:nums){
            if(num==missing){
                missing+=k;
            }
        }
        return missing;

    }
}