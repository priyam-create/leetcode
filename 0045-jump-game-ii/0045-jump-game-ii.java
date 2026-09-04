class Solution {
    public int jump(int[] nums) {
         if(nums.length==1)return 0;
        int jumps=0,max=0;
        int left =0,right=0;
        while(right<nums.length-1){
            for(int i=left;i<=right;i++){
                max=Math.max(max, i+nums[i]);
            }
            left=right+1;
            right=max;
            jumps++;
        }
        return jumps;
    }
}