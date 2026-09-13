class Solution {
    public int maximum69Number (int num) {
        int og = num;
        int position = 1;
        int left = 0;

        while (num > 0) {
            if (num % 10 == 6) {
                left = position;
            }
            position *= 10;
            num /= 10;
        }

        return og + 3 * left;
    }
}