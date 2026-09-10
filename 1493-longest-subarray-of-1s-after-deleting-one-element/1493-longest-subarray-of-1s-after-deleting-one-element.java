class Solution {
    public int longestSubarray(int[] nums) {
          int max=0;
        int s=0,e=0;
        int z=0;
        while(e<nums.length){
            //include
            int num=nums[e];
            if(num==0) z++;
            //shrink
            while(z>1){
                int st=nums[s];
                if(st==0) z--;
                s++;
            }

            int size=e-s;
            max=Math.max(size,max);
            e++;
        }
        return max;
    }
}