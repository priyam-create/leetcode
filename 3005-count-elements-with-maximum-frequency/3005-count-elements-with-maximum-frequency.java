class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] f=new int[101];
        for(int num:nums){
            f[num]++;
        }
        int maxf=0;
        for(int freq:f){
            maxf=Math.max(maxf,freq);
        }
        int ans=0;
        for(int count:f){
            if(count==maxf){
                ans+=count;
            }
        }
        return ans;
    }
}