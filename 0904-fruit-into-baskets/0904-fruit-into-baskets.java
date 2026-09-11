class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int max = 0;
        int f[]=new int[n];
        int type=0;
        int s=0,e=0;
        for(;e<n;e++){
            int ft=fruits[e];
            if(f[ft]==0)type++;
            f[ft]++;

            while(type>2){
                int st=fruits[s];
                f[st]--;
                if(f[st]==0)type--;
                s++;
            }
            int size=e-s+1;
            max=Math.max(max,size);
        }
        return max;

    }
}