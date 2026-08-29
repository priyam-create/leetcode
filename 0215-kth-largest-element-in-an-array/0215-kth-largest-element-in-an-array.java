class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] count = new int[20001];

        for (int x : nums) {
            count[x + 10000]++;
        }

        for (int i = 20000; i >= 0; i--) {
            k -= count[i];

            if (k <= 0) {
                return i - 10000;
            }
        }

        return -1;
    }
}