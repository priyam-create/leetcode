class Solution {
    public int addDigits(int num) {
         while(num>=10) {
            num=sum(num);
        }
        return num;
    }
    int sum(int n){
        int ans=0;
        while(n>0){
       ans+=(n%10);
        n/=10;
        }
        return ans;
    }
}