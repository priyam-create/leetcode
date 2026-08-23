class Solution {
    public boolean checkDivisibility(int n) {
        int o=n;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            product = product * rem;
            n = n / 10;
        }
        int d = sum + product;

        if (o % d == 0)
            return true;
        else
            return false;
    }
}