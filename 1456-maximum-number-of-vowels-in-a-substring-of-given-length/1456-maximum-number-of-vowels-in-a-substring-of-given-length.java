class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        int max = 0;
        int max_count = count;

        for (int i = k; i < s.length(); i++) {
            char l = s.charAt(i - k);
            char r = s.charAt(i);

            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                count--;
            }

            if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u') {
                count++;
            }

            max = Math.max(max_count, count);
            max_count = max;
        }

        return max_count;
    }
}