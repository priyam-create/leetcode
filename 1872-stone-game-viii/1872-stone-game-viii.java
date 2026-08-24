class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        for (int i = 1; i < n; i++) {
            stones[i] = stones[i] + stones[i - 1];
        }
        int scdiff = stones[n - 1];
        for (int i = n - 2; i >= 1; i--) {
            scdiff = Math.max(scdiff, stones[i] - scdiff);
        }
        return scdiff;

    }
}