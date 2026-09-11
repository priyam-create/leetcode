class Solution {
    public int maximumLengthSubstring(String s) {
        int[] f=new int[26];
        int left=0;
        int maxl=0;
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
            while(f[s.charAt(i)-'a']>2){
                f[s.charAt(left)-'a']--;
                left++;
            }
            maxl=Math.max(maxl,i-left+1);
        }
        return maxl;
    }
}