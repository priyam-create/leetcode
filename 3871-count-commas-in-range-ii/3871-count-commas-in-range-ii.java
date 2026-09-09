class Solution {
    public long countCommas(long n) {
        long count = 0;
        long digit = 1000;

        while (digit <= n) {
            count += n - digit + 1;
            digit *= 1000;
        }

        return count;
    }
}