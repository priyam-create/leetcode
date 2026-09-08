class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<=s.length()-3;i++){
            char first=s.charAt(i);
            char sec=s.charAt(i+1);
            char third=s.charAt(i+2);
            if(first!=sec&&sec!=third&&third!=first){
                count++;
            }
        }
        return count;
    }
}